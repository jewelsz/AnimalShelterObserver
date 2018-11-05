package Administration;

import Animals.*;

import java.util.ArrayList;
import java.util.Observable;

public class Register implements Subject
{
    public ArrayList<Dog> dogs;
    public ArrayList<Cat> cats;
    private ArrayList<Observer> observers;

    public Register()
    {
        dogs = new ArrayList<>();
        cats = new ArrayList<>();
        observers = new ArrayList<>();

    }

    public void newCat(String name, Gender gender, String badHabits)
    {
        Cat newcat = new Cat(name, gender, badHabits);
        cats.add(newcat);
    }

    public void newDog(Dog dog)
    {
        dogs.add(dog);
        Notify();
    }

    public void Attach(Observer o)
    {
        observers.add(o);
    }

    public void Detach(Observer o)
    {
        observers.remove(o);
    }

    public void Notify()
    {
        for(int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update(this);
        }
    }
}
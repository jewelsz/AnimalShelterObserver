package Administration;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;
import java.util.Observable;

public class Reservation extends Observable
{
    public ArrayList<Animal> Animals = new ArrayList<Animal>();

    public Reservation()
    {

    }

    public void NewCat(String name, Gender gender, String badHabits)
    {
        Animal newcat = new Cat(name, gender, badHabits);
        this.Animals.add(newcat);
        setChanged();
        notifyObservers(newcat);
    }

    public void NewDog(String name, Gender gender)
    {
        Animal newdog = new Dog(name, gender);
        this.Animals.add(new Dog(name, gender));
        setChanged();
        notifyObservers(newdog);
    }
}

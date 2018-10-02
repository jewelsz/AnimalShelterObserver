package sample;

import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Webshop
{
    private List<Animal> animals = new ArrayList<>();

    private static Webshop instance = null;

    protected Webshop(){}

    public static Webshop getInstance(){
        if(instance == null) {
            instance = new Webshop();
        }
        return instance;
    }

    public void setState() {
        notifyAllObservers();
    }

    public void attach(Animal observer){
        animals.add(observer);
    }

    public void notifyAllObservers(){
        for (Animal observer : animals) {
            //observer.update();
        }
    }

    public List<Animal> getAnimals()
    {
        return animals;
    }

}

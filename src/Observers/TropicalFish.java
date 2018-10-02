package Observers;

import java.util.Observable;
import java.util.Observer;

public class TropicalFish implements Observer
{
    private String name;

    public TropicalFish(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        System.out.print(getName() + " has just been fed!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

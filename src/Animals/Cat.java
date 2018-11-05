package Animals;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal
{

    public String BadHabits;
    private int maxPrice = 350;

    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender, 350);

        BadHabits = badHabits;
        int discount = badHabits.length() * 20;
        int price = maxPrice - discount;
        if( price < 35)
        {
            this.price = 35;
        }
        else
        {
            this.price = price;
        }

    }

    public String getBadHabits()
    {
        return BadHabits;
    }

    public void setBadHabits(String badHabits)
    {
        BadHabits = badHabits;
    }

}

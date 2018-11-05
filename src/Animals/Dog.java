package Animals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dog extends Animal implements Observer
{
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Date LastWalk;

    public boolean NeedsWalk;


    public Dog(String name, Animals.Gender gender)
    {
        super(name, gender, 550);
        LastWalk = new Date();
    }

    public void update(Object obj)
    {

            price = price - 50;
            if(price < 50)
            {
                price = 50;
            }

            System.out.println("Name: " + getName() + "      Price: " + price);



    }

    public Date getLastWalk()
    {
        return LastWalk;
    }

    public boolean getNeedsWalk()
    {
        Date today = new Date();
        if(today.after(LastWalk))
        {
            return true;
        }
        return false;
    }

    public String ToString()
    {
        return super.ToString() +
                ", last walk: "+ dateFormat.format(LastWalk) + ", Price: "+ this.price;
    }

}

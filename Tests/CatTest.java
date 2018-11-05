import Administration.Register;
import Animals.Animal;
import Animals.Cat;
import Animals.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest
{
    @Test
    public void checkCatsPrice()
    {
        Register reg = new Register();
        Cat cat1 = new Cat("kat 1", Gender.Male, "tekst");
        Cat cat2 = new Cat("kat 1", Gender.Male, "t");
        Cat cat3 = new Cat("kat 1", Gender.Male, "teeeeeest");

        for(Cat cats : reg.cats)
        {
            System.out.println(cats.Name + " " + cats.price);
        }
    }

}
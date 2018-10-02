package Animals;
import java.util.Date;
import java.util.Observable;

public class Animal
{
    public String Name;
    public Gender Gender;
    public Reservor ReservedBy;

    public Animal(String name, Animals.Gender gender)
    {
        Name = name;
        Gender = gender;
    }

    public Animal() {
    }

    public boolean Reserve(String reservedBy)
    {
        if (this.ReservedBy == null)
        {
            Date today = new Date();
            this.ReservedBy = new Reservor(reservedBy, today);
            return true;
        }
        return false;
    }

    public String ToString()
    {
        String reserved = "not reserved";
        if (this.ReservedBy != null)
        {
            reserved = "reserved by " + this.ReservedBy.Name;
        }
        return this.Name + " , " + this.Gender + " , " + reserved;
    }


    public String getName()
    {
        return Name;
    }

    public Animals.Gender getGender()
    {
        return Gender;
    }

    public Reservor getReservedBy()
    {
        return ReservedBy;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public void setGender(Animals.Gender gender)
    {
        Gender = gender;
    }

    public void setReservedBy(Reservor reservedBy)
    {
        ReservedBy = reservedBy;
    }

}

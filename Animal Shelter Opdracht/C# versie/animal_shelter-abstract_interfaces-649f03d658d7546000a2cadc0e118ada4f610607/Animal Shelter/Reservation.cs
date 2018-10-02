using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Animal_Shelter.Animals;

namespace Animal_Shelter
{
    public class Reservation
    {
        public List<Animal> Animals { get; private set; } = new List<Animal>();
        
        public void NewCat(string name, Gender gender, string badHabits)
        {
            this.Animals.Add(new Cat(name, gender, badHabits));
        }
        
        public void NewDog(string name, Gender gender)
        {
            this.Animals.Add(new Dog(name, gender));
        }
    }
}

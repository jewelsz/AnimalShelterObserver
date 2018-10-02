using System;
using System.Diagnostics.Contracts;

namespace Animal_Shelter.Animals
{
    public class Cat : Animal
    {
        public string BadHabits { get; private set; }

        public Cat(string name, Gender gender, string badHabits)
            : base(name, gender)
        {
            this.BadHabits = badHabits;
        }

        public override string ToString()
        {
            return base.ToString() +
                $", bad habits: {this.BadHabits.ToLower()}";
        }
    }
}

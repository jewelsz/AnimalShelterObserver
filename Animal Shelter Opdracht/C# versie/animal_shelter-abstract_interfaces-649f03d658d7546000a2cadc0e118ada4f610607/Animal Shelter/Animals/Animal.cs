using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animal_Shelter.Animals
{
    public class Animal
    {
        public string Name { get; private set; }
        public Gender Gender { get; private set; }
        public Reservor ReservedBy { get; private set; }

        public Animal(string name, Gender gender)
        {
            this.Name = name;
            this.Gender = gender;
        }

        public bool Reserve(string reservedBy)
        {
            if (this.ReservedBy == null)
            {
                this.ReservedBy = new Reservor(reservedBy, DateTime.Now);
                return true;
            }
            return false;
        }

        public override string ToString()
        {
            string reserved = "not reserved";
            if (this.ReservedBy != null)
            {
                reserved = $"reserved by {this.ReservedBy.Name}";
            }
            return $"{this.Name}, {this.Gender}, {reserved}";
        }
    }
}

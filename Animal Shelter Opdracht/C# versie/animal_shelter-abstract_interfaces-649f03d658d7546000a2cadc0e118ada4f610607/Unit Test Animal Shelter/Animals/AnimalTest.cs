using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Animal_Shelter.Animals;

namespace Unit_Test_Animal_Shelter.Animals
{
    [TestClass]
    public class AnimalTest
    {
        private Animal animal;

        [TestInitialize]
        public void TestInitialize()
        {
            this.animal = new Animal("Ugly Duckling", Gender.Male);
        }

        [TestMethod]
        public void TestConstructor()
        {
            Assert.AreEqual("Ugly Duckling", this.animal.Name);
            Assert.AreEqual(Gender.Male, this.animal.Gender);
            Assert.IsNull(this.animal.ReservedBy);
        }

        [TestMethod]
        public void TestReservation()
        {
            Assert.IsNull(this.animal.ReservedBy);
            Assert.IsTrue(this.animal.Reserve("John Doe"));
            Assert.IsNotNull(this.animal.ReservedBy);
            Assert.AreEqual("John Doe", this.animal.ReservedBy.Name);
            Assert.IsFalse(this.animal.Reserve("Jane Doe"));
        }

        [TestMethod]
        public void TestReservationTime()
        {
            // TODO: Implement this when interfaces have been explained.
            // We don't yet test the reserved time because it used the current
            // system clock to determine the result. Therefore we cannot check
            // if the values are the same, since two consecutive calls to
            // DateTime.Now are very likely to give different results. There is
            // a way to account for this, but the solution will use interfaces:
            // a concept that is not yet discussed in class. To be implemented.
            Assert.Inconclusive("Implement this when interfaces have been explained");
        }
    }
}

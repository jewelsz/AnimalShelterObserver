using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Animal_Shelter;
using Animal_Shelter.Animals;

namespace Unit_Test_Animal_Shelter
{
    [TestClass]
    public class ReservationTest
    {
        private Reservation reservation;

        [TestInitialize]
        public void TestInitialize()
        {
            this.reservation = new Reservation();
        }

        [TestMethod]
        public void TestNewCat()
        {
            Assert.AreEqual(0, this.reservation.Animals.Count);
            this.reservation.NewCat("Ms. Meow", Gender.Female, "Scratches couch");
            Assert.AreEqual(1, this.reservation.Animals.Count);
        }

        [TestMethod]
        public void TestNewDog()
        {
            Assert.AreEqual(0, this.reservation.Animals.Count);
            this.reservation.NewDog("Sgt. Woof", Gender.Male);
            Assert.AreEqual(1, this.reservation.Animals.Count);
        }
    }
}

using System;
using System.Windows.Forms;
using Animal_Shelter.Animals;

namespace Animal_Shelter
{
    public partial class Form1 : Form
    {
        private Reservation reservations = new Reservation();

        public Form1()
        {
            InitializeComponent();
        }

        private void cmbSpecies_SelectedIndexChanged(object sender, EventArgs e)
        {
            this.txtBadHabits.Enabled = this.cmbSpecies.Text == "Cat";
        }

        private void RefreshControls()
        {
            lstAnimals.Items.Clear();
            foreach (Animal animal in this.reservations.Animals)
            {
                lstAnimals.Items.Add(animal);
            }

            btnReserveAnimal.Enabled = lstAnimals.SelectedItem != null;
        }

        private void btnAddAnimal_Click(object sender, EventArgs e)
        {
            Gender gender = radMale.Checked ? Gender.Male : Gender.Female;

            if (this.cmbSpecies.Text == "Cat")
            {
                this.reservations.NewCat(
                    txtName.Text, gender, txtBadHabits.Text);
            }
            else if (this.cmbSpecies.Text == "Dog")
            {
                this.reservations.NewDog(txtName.Text, gender);
            }

            this.RefreshControls();
        }

        private void btnReserveAnimal_Click(object sender, EventArgs e)
        {
            Animal animal = lstAnimals.SelectedItem as Animal;

            if (animal != null)
            {
                animal.Reserve(txtReservor.Text);
                this.RefreshControls();
            }
        }

        private void lstAnimals_SelectedIndexChanged(object sender, EventArgs e)
        {
            btnReserveAnimal.Enabled = lstAnimals.SelectedItem != null;
        }
    }
}

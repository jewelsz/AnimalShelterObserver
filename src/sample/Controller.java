package sample;

import Administration.Reservation;
import Animals.Animal;
import Animals.Gender;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

public class Controller implements Initializable, Observer
{
    Webshop web = new Webshop();

    public TextField nameTxt;
    public TextArea habitsTxt;
    public Label warmingMessageTxt;


    Reservation res = new Reservation();

    private boolean isCat = true;
    private Gender gender = Gender.Female;

    public void changeToCat()
    {
        isCat = true;
        habitsTxt.setDisable(false);
    }

    public void changeToDog()
    {
        isCat = false;
        habitsTxt.setDisable(true);
    }

    public  void changeToMale()
    {
        gender = Gender.Male;
    }

    public void changeToFemale()
    {
        gender = Gender.Female;
    }

    public void addAnimal()
    {
        if(isCat)
        {

            if(nameTxt.getText() != null && habitsTxt.getText() != null)
            {
                warmingMessageTxt.setVisible(false);
                res.NewCat(nameTxt.getText(), gender, habitsTxt.getText());
                System.out.print("Cat added");
            }
            else
            {
                warmingMessageTxt.setVisible(true);
            }
        }
        if(!isCat)
        {
            if(nameTxt.getText() != null)
            {
                warmingMessageTxt.setVisible(false);
                res.NewDog(nameTxt.getText(), gender);
            }
        }

    }



    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        habitsTxt.setText(null);
        nameTxt.setText(null);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        System.out.print("New animal has been added: " + arg.toString());
    }


}

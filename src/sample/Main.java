package sample;

import Administration.Register;
import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.List;

public class Main
{
/*
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
*/

    public static void main(String[] args)
    {
        Register reg = new Register();
        //launch(args);
        reg.newCat("kat 1", Gender.Female, "tekst");
        reg.newCat("kat 2", Gender.Female, "t");
        reg.newCat("kat 3", Gender.Female, "teeeeeest");


        System.out.println("List after first update");
        Dog dog1 = new Dog("hond 1", Gender.Male);
        reg.Attach(dog1);
        reg.newDog(dog1);

        System.out.println("List after second update");
        Dog dog2 = new Dog("hond 2", Gender.Male);
        reg.Attach(dog2);
        reg.newDog(dog2);

        System.out.println("List after third update");
        Dog dog3 = new Dog("hond 3", Gender.Male);
        reg.Attach(dog3);
        reg.newDog(dog3);

        System.out.println("List after fourth update");
        Dog dog4 = new Dog("hond 4", Gender.Male);
        reg.Attach(dog4);
        reg.newDog(dog4);



    }
}

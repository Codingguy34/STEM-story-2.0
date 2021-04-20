package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class CreditsMenuController {

    @FXML
    public Label CreditOutput;



    public Parent root;
    public Stage stage;
    public Scene CreditsMenu;


    public void buttonsNonVisable(){

    }


    public void revealManuelCredits(){
       CreditOutput.setText("Manuel did most of the Thunkable backup and wrote some of the story");
    }

    public void revealJosiahCredits(){
       CreditOutput.setText("Josiah designed the icon, helped with play testing, and came up with parts of the early story ");
    }

    public void revealHassebCredit(){

        CreditOutput.setText("Hasseb helped with the Thunkable backup");
    }

    public void revealJonathanCredit(){
        CreditOutput.setText("Jonathan coded the app that you are using now, he also wrote the story, and built the GUI");
    }

    public void CreditsBackClick(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        root = loader.load();

        Controller CreditsControllerControleller = loader.getController();


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        CreditsMenu = new Scene(root, 2048, 1080);
        stage.setScene(CreditsMenu);
    }


}

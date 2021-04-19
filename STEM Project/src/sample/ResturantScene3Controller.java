package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ResturantScene3Controller {

    public Label CreditOutput;
    public Label CreditsLabel;

    public Button CODECredits;

    public Parent root;
    public Stage stage;
    public Scene CreditsScene;


    public void hide(){
        CODECredits.setVisible(false);
        CreditsLabel.setVisible(false);

    }

    public void CODEone(){
        CreditsLabel.setVisible(true);
        CODECredits.setVisible(true);
        CreditOutput.setText("Wrong Answer: Years later, you are taking your last breaths as you are now old and u see your coffin with a key hole, but you don't have a key and brush off the thought");
    }

    public void CODEfour(){
        CreditsLabel.setVisible(true);
        CODECredits.setVisible(true);
        CreditOutput.setText("Wrong Answer: Years later, you are taking your last breaths as you are now old and u see your coffin with a key hole, but you don't have a key and brush off the thought");
    }

    public void CODEthree(){
        CreditsLabel.setVisible(true);
        CODECredits.setVisible(true);
        CreditOutput.setText("Wrong Answer: Years later, you are taking your last breaths as you are now old and u see your coffin with a key hole, but you don't have a key and brush off the thought");
    }

    public void CODEtwo(){
        CreditsLabel.setVisible(true);
        CODECredits.setVisible(true);
        CreditOutput.setText("Correct Answer: Years later, you are taking your last breaths as you are now old and u see your coffin with a key hole, you use the key you got years earlier only to dicover that you are really being controlled by someone else.");
    }

    public void creditsButton(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CreditsMenu.fxml"));
        root = loader.load();

        CreditsMenuController ResturantController = loader.getController();




        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        CreditsScene = new Scene(root, 2048, 1080);
        stage.setScene(CreditsScene);
    }




}

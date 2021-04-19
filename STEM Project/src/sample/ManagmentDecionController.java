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

public class ManagmentDecionController {

    @FXML

    public Button FireButton;

    public Label FireLabel;
    public Label OutPutLabel;
    public Label NothingLabel;

    public Button NothingButton2;

    public Parent root;
    public Stage stage;
    public Scene ManagmentScene;

    public void hide(){
        NothingButton2.setVisible(false);
        NothingLabel.setVisible(false);
    }

    public void FireButtonOnclick(){
        NothingLabel.setVisible(true);
        NothingButton2.setVisible(true);

        MainBackend ManagmentFrontEnd = new MainBackend();
        ManagmentFrontEnd.incermentdecion(1);

       ManagmentFrontEnd.RandomEvent2A();

       String randomEvent = ManagmentFrontEnd.highScore;

        OutPutLabel.setText(randomEvent);
    }

    public void SwitchToResturant(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResturantScene1.fxml"));
        root = loader.load();

        ResturantScene1Controller ResturantController = loader.getController();
        ResturantController.HideButton();



        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ManagmentScene = new Scene(root, 2048, 1080);
        stage.setScene(ManagmentScene);
    }
}

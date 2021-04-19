package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeSceneControleller {

    @FXML
    public Parent root;
    public Scene WakeUP;
    public Stage stage;


    public void hello(ActionEvent event) throws IOException {

        MainBackend homeSceneController = new MainBackend();
        homeSceneController.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("WakeUpScene.fxml"));
        root = loader.load();

        WakeUpController wakeUpController = loader.getController();
        wakeUpController.buttonVisable();


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        WakeUP = new Scene(root, 2048, 1080);
        stage.setScene(WakeUP);
    }

}

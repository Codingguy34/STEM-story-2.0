package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public Parent root;
    public Stage stage;
    public Scene HomeScene;
    public Scene CreditsMenu;

    public Button closeButton;

    public void SwitchToCredits(ActionEvent event) throws IOException{
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CreditsMenu.fxml"));
        root = loader.load();

        CreditsMenuController creditsMenuSceneControleller = loader.getController();



        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        CreditsMenu = new Scene(root, 2048, 1080);
        stage.setScene(CreditsMenu);
    }


    public void SwitchToHomeScene(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("WakeUpScene.fxml"));
        root = loader.load();

        WakeUpController homeSceneControleller = loader.getController();
        homeSceneControleller.buttonVisable();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        HomeScene = new Scene(root, 2048, 1080);
        stage.setScene(HomeScene);
    }

    public void CloseGame(ActionEvent event){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }



}

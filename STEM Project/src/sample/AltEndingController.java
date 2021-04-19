package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AltEndingController {


    public Parent root;
    public Scene CreditsScene;
    public Stage stage;

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

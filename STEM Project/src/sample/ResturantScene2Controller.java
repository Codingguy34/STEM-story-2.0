package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ResturantScene2Controller {


    public Parent root;
    public Stage stage;
    public Scene ResturantScenetwo;
    public Scene ResturantScenethree;

    public void CheckitoutOnclick(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResturantScene3.fxml"));
        root = loader.load();

        ResturantScene3Controller ResturantController = loader.getController();
        ResturantController.hide();



        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ResturantScenetwo = new Scene(root, 2048, 1080);
        stage.setScene(ResturantScenetwo);

    }
    public void DontCheckitoutOnclick(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Newending.fxml"));
        root = loader.load();

        AltEndingController ResturantController = loader.getController();




        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ResturantScenethree = new Scene(root, 2048, 1080);
        stage.setScene(ResturantScenethree);
    }




}

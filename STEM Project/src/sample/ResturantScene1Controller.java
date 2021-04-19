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

public class ResturantScene1Controller {

    public Button DontEatThePizzaButton;
    public Button EatThePizzaButton;
    public Button NextLevelButton;

    public Label NothingLabel;
    public Label OutPutLabel;

    public Parent root;
    public Stage stage;
    public Scene ResturantsceneOne;

    public void HideButton(){
        NextLevelButton.setVisible(false);
        NothingLabel.setVisible(false);
    }

    public void DontEatThePizzaOnClick(){
        NextLevelButton.setVisible(true);
        NothingLabel.setVisible(true);

        MainBackend ResturantFrontEnd = new MainBackend();
        ResturantFrontEnd.incermentdecion(1);
        ResturantFrontEnd.RandomEvent1A();

        String RandomEventHolder = ResturantFrontEnd.highScore;

        OutPutLabel.setText(RandomEventHolder);

    }

    public void EatThePizzaOnClick(){
        NextLevelButton.setVisible(true);
        NothingLabel.setVisible(true);

        MainBackend ResturantFrontEnd = new MainBackend();
        ResturantFrontEnd.incermentdecion(1);
        ResturantFrontEnd.RandomEvent1A();

        String RandomEventHolder = ResturantFrontEnd.highScore;

        OutPutLabel.setText(RandomEventHolder);

    }

    public void NextLevelOnclick(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ResturantScene2.fxml"));
        root = loader.load();

        ResturantScene2Controller ResturantController = loader.getController();




        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ResturantsceneOne = new Scene(root, 2048, 1080);
        stage.setScene(ResturantsceneOne);
    }


}

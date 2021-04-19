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

public class WakeUpController {


    public Label OutputLabel;
    public Label NextLevelLabel;

    public Button NextLevel;


    public Parent root;
    public Stage stage;
    public Scene workScene;


    public void buttonVisable(){

        NextLevel.setVisible(false);
        NextLevelLabel.setVisible(false);


    }





    public void Choice1Click(ActionEvent event) throws IOException {
        MainBackend controllerfrontend = new MainBackend();
        controllerfrontend.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("WorkSection.fxml"));
        root = loader.load();

        WorkSceneController homeSceneControleller = loader.getController();
        homeSceneControleller.Hide();


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        workScene = new Scene(root, 2048, 1080);
        stage.setScene(workScene);
    }

    public void buttonChoice1Onclick(){
        NextLevel.setVisible(true);
        NextLevelLabel.setVisible(true);



        MainBackend wakeUpController = new MainBackend();
        wakeUpController.RandomEvent1A();

        String scoreText = wakeUpController.highScore;
        wakeUpController.incermentdecion(1);

        OutputLabel.setText(scoreText);

    }

    public void buttonChoice2Onclick(){
        NextLevel.setVisible(true);
        NextLevelLabel.setVisible(true);


        MainBackend wakeUpController = new MainBackend();
        wakeUpController.RandomEvent1A();

        String scoreText = wakeUpController.highScore;
        wakeUpController.incermentdecion(1);

        OutputLabel.setText(scoreText);

    }

    public void buttonChoice3Onclick(){
        NextLevel.setVisible(true);
        NextLevelLabel.setVisible(true);



        MainBackend wakeUpController = new MainBackend();
        wakeUpController.RandomEvent1A();

        String scoreText = wakeUpController.highScore;
        wakeUpController.incermentdecion(1);

        OutputLabel.setText(scoreText);

    }

}

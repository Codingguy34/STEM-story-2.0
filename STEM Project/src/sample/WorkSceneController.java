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

public class WorkSceneController {

    @FXML

    public Button sevenDays;
    public Button fourtosixdays;
    public Button twoTothreeDays;
    public Button NextLevel;

    public Label NextLevelLable;
    public Label NextlevelLable;

    public Parent root;
    public Stage stage;
    public Scene WorkScene;

    public void Hide(){
        NextLevel.setVisible(false);
        NextlevelLable.setVisible(false);
    }

    public void SevenDaysAfterClick(ActionEvent event) throws IOException {
        MainBackend homeSceneController = new MainBackend();
        homeSceneController.incermentdecion(1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagmentDecion.fxml"));
        root = loader.load();

        ManagmentDecionController wakeUpController = loader.getController();
        wakeUpController.hide();


        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        WorkScene = new Scene(root, 2048, 1080);
        stage.setScene(WorkScene);
    }

    public void sevenOnClick(){



        MainBackend worksceneFrontend = new MainBackend();
        worksceneFrontend.incermentdecion(1);
        worksceneFrontend.RandomEvent2A();
        NextLevel.setVisible(true);
        NextlevelLable.setVisible(true);

        String promptAnswer = worksceneFrontend.highScore;


        NextLevelLable.setText(promptAnswer);

    }

    public void fourtosixdaysOnclick(){



        MainBackend workFrontend = new MainBackend();
        workFrontend.incermentdecion(1);
        workFrontend.RandomEvent2A();
        NextLevel.setVisible(true);
        NextlevelLable.setVisible(true);

        String promptAnswer = workFrontend.highScore;


        NextLevelLable.setText(promptAnswer);
    }

    public void TwotoThreeOnclick(){



        MainBackend workFrontend = new MainBackend();
        workFrontend.incermentdecion(1);
        workFrontend.RandomEvent2A();
        NextLevel.setVisible(true);
        NextlevelLable.setVisible(true);

        String promptAnswer = workFrontend.highScore;


        NextLevelLable.setText(promptAnswer);
    }


}

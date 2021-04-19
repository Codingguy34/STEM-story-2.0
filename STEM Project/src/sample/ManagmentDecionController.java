package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ManagmentDecionController {

    @FXML

    public Button FireButton;

    public Label FireLabel;
    public Label OutPutLabel;
    public Label NothingLabel;

    public Button NothingButton2;

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
}

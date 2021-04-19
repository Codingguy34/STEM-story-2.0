package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("STEM Project");
        Image icon = new Image("icon.png");
        primaryStage.getIcons().add(icon);
        String Css = this.getClass().getResource("main.css").toExternalForm();
        Scene scene = new Scene(root, 2048, 1020);
        scene.getStylesheets().add(Css);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

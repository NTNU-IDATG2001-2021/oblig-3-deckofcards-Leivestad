package no.ntnu.idatg2001;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/cardgame.fxml."));
        stage.setTitle("CardGame");
        stage.setScene(new Scene(root));
        stage.show();
        /*var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();

         */
    }

    public static void main(String[] args) {
        launch();
    }

}
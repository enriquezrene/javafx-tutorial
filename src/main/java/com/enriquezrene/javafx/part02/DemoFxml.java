package com.enriquezrene.javafx.part02;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by rene on 28/03/16.
 */
public class DemoFxml extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load components from the xml file (from the resource folder with the full name specified)
        Parent group = new FXMLLoader().load(getClass().getResource("DemoFxml.fxml"));

        Scene scene = new Scene(group, 500, 250, Color.LIGHTBLUE);
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

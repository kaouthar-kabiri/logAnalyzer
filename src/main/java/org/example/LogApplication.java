package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LogApplication extends Application {
   @Override
   public void start(Stage primaryStage) {
       try {
           Parent root = FXMLLoader.load(getClass().getResource("view1.fxml"));
           Scene scene = new Scene(root, 560, 400);
           primaryStage.setTitle("File's Path");
           primaryStage.setScene(scene);
           primaryStage.setResizable(false);
           primaryStage.show();
       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }
    public static void main(String[] args) {
        launch(args);

    }
}



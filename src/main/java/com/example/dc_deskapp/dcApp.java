package com.example.dc_deskapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class dcApp extends Application {
        @Override
   public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(dcApp.class.getResource("hello-view.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
       // fxmlLoader.setRoot(new AnchorPane());
        //Parent root = fxmlLoader.load();
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch();


    }
}
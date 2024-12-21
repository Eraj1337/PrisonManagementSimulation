package com.example.prisonmanagementsoftaware;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LoginPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Prison Management System");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public String toString() {
        return "HelloApplication{}";
    }

    public static void main(String[] args) {
        launch();
    }
}
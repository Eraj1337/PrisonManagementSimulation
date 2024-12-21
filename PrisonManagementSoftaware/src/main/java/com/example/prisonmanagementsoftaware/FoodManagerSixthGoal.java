package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerSixthGoal {

    @FXML
    private TextField iteminput;

    @FXML
    private TextField quantityinput;

    @FXML
    private AnchorPane smsevenpage;

    @FXML
    private TextField supplierinput;

    @FXML
    void fmsixaddbutton(ActionEvent event) {

    }

    @FXML
    void fmsixback(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

    }
    private void switchScene(String fxmlFile, ActionEvent event) throws IOException {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        AnchorPane newSceneRoot = loader.load();

        // Get the current stage
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        Scene scene = new Scene(newSceneRoot);
        stage.setScene(scene);
        stage.show();
    }
}

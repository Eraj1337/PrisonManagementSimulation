package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerFifthGoal {

    @FXML
    private AnchorPane fmfivepage;

    @FXML
    private TableView<?> fmfivetable;
    @FXML
    void fmfivebackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

    }

    @FXML
    private TextField upfateinput;

    @FXML
    void fmfivesubmitbutton(ActionEvent event) {

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

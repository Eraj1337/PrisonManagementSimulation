package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerSecondGoal {

    @FXML
    private TextField fmtwoamountinput;

    @FXML
    private Label fmtwoamountlabel;

    @FXML
    private TextField fmtwocategoryinput;

    @FXML
    private Label fmtwocategorylabel;

    @FXML
    private DatePicker fmtwodateinput;

    @FXML
    private Label fmtwodatelabel;

    @FXML
    private TextArea fmtwodescriptioninput;

    @FXML
    private Label fmtwodescriptionlabel;

    @FXML
    private AnchorPane fmtwopage;

    @FXML
    private Label fmtwotitle;

    @FXML
    void fmtwobackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

    }

    @FXML
    void fmtwosubmitbutton(ActionEvent event) {

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

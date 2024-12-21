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

public class SecuritySecondGoal {

    @FXML
    private DatePicker smtwodateinput;

    @FXML
    private Label smtwodatelabel;

    @FXML
    private TextArea smtwodetailsinput;

    @FXML
    private Label smtwodetailslabel;

    @FXML
    private Label smtwoinmateid;

    @FXML
    private TextField smtwoinmateidinput;

    @FXML
    private AnchorPane smtwopage;

    @FXML
    private Label smtwotitle;

    @FXML
    void smtwobackbutton(ActionEvent event)  throws IOException {switchScene("DashboardSecurity.fxml", event);

    }

    @FXML
    void smtwosavetransferinfobutton(ActionEvent event) {

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

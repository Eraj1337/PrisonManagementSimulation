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

public class SecurityFirstGoal {

    @FXML
    private DatePicker smonedateinput;

    @FXML
    private Label smonedatelabel;

    @FXML
    private TextArea smonedescriptioninput;

    @FXML
    private Label smonedescriptionlabel;

    @FXML
    private TextField smoneinmateidinput;

    @FXML
    private Label smoneinmateidlabel;

    @FXML
    private AnchorPane smonepage;

    @FXML
    private TextField smonetimeinput;

    @FXML
    private Label smonetimelabel;

    @FXML
    private Label smonetitle;

    @FXML
    void saverecordbutton(ActionEvent event) {

    }

    @FXML
    void smonebackbutton(ActionEvent event) throws IOException {switchScene("DashboardSecurity.fxml", event);

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



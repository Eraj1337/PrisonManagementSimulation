package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SecurityFifthGoal {

    @FXML
    private TextField smfiveinmatesinvolvedinput;

    @FXML
    private Label smfiveinmatesinvolvedlabel;

    @FXML
    private TextField smfivelocationinput;

    @FXML
    private Label smfivelocationlabel;

    @FXML
    private AnchorPane smfivepage;

    @FXML
    private Label smfivetimelabel;

    @FXML
    private Label smfivetitle;

    @FXML
    private TextField smfivetypeinput;

    @FXML
    private Label smfivetypelabel;

    @FXML
    void smfiveassignstaffbutton(ActionEvent event) {

    }

    @FXML
    void smfivebackbutton(ActionEvent event)  throws IOException {switchScene("DashboardSecurity.fxml", event);

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

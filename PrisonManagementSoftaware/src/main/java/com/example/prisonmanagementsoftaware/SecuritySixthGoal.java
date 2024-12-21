package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SecuritySixthGoal {

    @FXML
    private TextField smsithagencyinput;

    @FXML
    private Label smsixthagencylabel;

    @FXML
    private Button smsixthbackbutton;

    @FXML
    private DatePicker smsixthdateinput;

    @FXML
    private Label smsixthdatelabel;

    @FXML
    private AnchorPane smsixthpage;

    @FXML
    private TextField smsixthpersoninput;

    @FXML
    private Label smsixthpersonlabel;

    @FXML
    private TextArea smsixthpurposeinput;

    @FXML
    private Label smsixthpurposelabel;

    @FXML
    private Label smsixthtitle;

    @FXML
    void smsixthbackbutton(ActionEvent event)   throws IOException {switchScene("DashboardSecurity.fxml", event);

    }

    @FXML
    void smsixthcoordinatebutton(ActionEvent event) {

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

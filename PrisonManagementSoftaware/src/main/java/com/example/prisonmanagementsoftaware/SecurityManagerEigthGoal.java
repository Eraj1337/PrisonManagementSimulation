package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SecurityManagerEigthGoal {

    @FXML
    private DatePicker smeighthdateinput;

    @FXML
    private Label smeighthdatelabel;

    @FXML
    private TextField smeighthlocationinput;

    @FXML
    private Label smeighthlocationtitle;

    @FXML
    private AnchorPane smeighthpage;

    @FXML
    private Label smeighthtitle;

    @FXML
    private Label smeighthtypelabel;

    @FXML
    void smeighthbackbutton(ActionEvent event) throws IOException {switchScene("DashboardSecurity.fxml", event);

    }

    @FXML
    void smeighthcompliancerb(ActionEvent event) {

    }

    @FXML
    void smeighthequipmentsrb(ActionEvent event) {

    }

    @FXML
    void smeighthfinancialrb(ActionEvent event) {

    }

    @FXML
    void smeighthgeneratebutton(ActionEvent event) {

    }

    @FXML
    void smeighthincidentrb(ActionEvent event) {

    }

    @FXML
    void smeighthpolicyrb(ActionEvent event) {

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

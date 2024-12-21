package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private AnchorPane loginpage;

    @FXML
    private PasswordField passwordinput;
    private static final String SMuserid = "Security";
    private static final String FMuserid = "Food";
    private static final String PASSWORD = "admin";


    @FXML
    private Label passwordlabel;

    @FXML
    private TextField useridinput;

    @FXML
    private Label useridlabel;

    @FXML
    private Label welcomelogin;

    @FXML
    void buttonclick(ActionEvent event) throws IOException {
        // Get input values
        String username = useridinput.getText();
        String password = passwordinput.getText();

        // Validate credentials for both users
        if (username.equals(SMuserid) && password.equals(PASSWORD)) {
            // If Security Officer, switch to DashboardSecurity
            switchToDashboard("DashboardSecurity.fxml", event);
        } else if (username.equals(FMuserid) && password.equals(PASSWORD)) {
            // If Food Manager, switch to DashboardFoodManager
            switchToDashboard("DashboardFoodManager.fxml", event);
        } else {
            // If credentials don't match, just do nothing
            useridinput.clear();
            passwordinput.clear();
        }
    }

    private void switchToDashboard(String fxmlFile, ActionEvent event) throws IOException {
        // Load the corresponding FXML for the dashboard
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        AnchorPane homepage = loader.load();

        // Get the current stage
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene and show the dashboard
        Scene scene = new Scene(homepage);
        stage.setScene(scene);
        stage.show();
    }
}




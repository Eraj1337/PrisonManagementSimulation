package com.example.prisonmanagementsoftaware;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button buttonclick;

    @FXML
    protected void buttonclick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DashboardSecurity.fxml"));
        AnchorPane DashboardSecurity = loader.load();

        // Get the current stage (window)
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

        // Set the new scene (DashboardSecurity) in the current stage
        Scene scene = new Scene(DashboardSecurity);
        stage.setScene(scene);

    }


}
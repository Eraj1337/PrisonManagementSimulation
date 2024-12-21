package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerFirstGoal {

    @FXML
    private TextArea rmonebreakfastinput;

    @FXML
    private Label rmonebreakfastlabel;

    @FXML
    private DatePicker rmonedateinput;

    @FXML
    private Label rmonedatelabel;

    @FXML
    private TextArea rmonedinnerinput;

    @FXML
    private Label rmonedinnerlabel;

    @FXML
    private TextArea rmonelunchinput;

    @FXML
    private Label rmonelunchlabel;

    @FXML
    private AnchorPane rmonepage;

    @FXML
    private Button rmonesubmitbutton;

    @FXML
    private Label rmonetitle;

    @FXML
    void rmonebackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

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


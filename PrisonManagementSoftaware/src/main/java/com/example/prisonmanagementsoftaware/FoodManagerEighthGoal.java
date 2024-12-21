package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerEighthGoal {

    @FXML
    private Label fmeightaddlabel;

    @FXML
    private TextField fmeightinmateidinput;

    @FXML
    private Label fmeightinmateidlabel;

    @FXML
    private AnchorPane fmeightpage;

    @FXML
    private Label fmeightplabel;

    @FXML
    private Label fmeightrlabel;

    @FXML
    private TextArea fmeightrpinput;

    @FXML
    private Label fmeightstatuslabel;

    @FXML
    private TableView<?> fmeightstatustable;

    @FXML
    private Label fmeighttitle;

    @FXML
    void fmeightaddbutton(ActionEvent event) {

    }

    @FXML
    void fmeightbackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

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

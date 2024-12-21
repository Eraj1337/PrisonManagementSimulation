package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerSeventhGoal {

    @FXML
    private Label fmsevenaddlabel;

    @FXML
    private DatePicker fmsevendateinput;

    @FXML
    private Label fmsevendatelabel;

    @FXML
    private AnchorPane fmsevenpage;

    @FXML
    private TextField fmsevenquantityinput;

    @FXML
    private Label fmsevenquantitylabel;

    @FXML
    private TableView<?> fmsevenrecordtable;

    @FXML
    private Label fmsevenstatuslabel;

    @FXML
    private Label fmseventitle;

    @FXML
    private TextField fmseventypeinput;

    @FXML
    private Label fmseventypelabel;

    @FXML
    void fmsevenaddbutton(ActionEvent event) {

    }

    @FXML
    void fmsevenbackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

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

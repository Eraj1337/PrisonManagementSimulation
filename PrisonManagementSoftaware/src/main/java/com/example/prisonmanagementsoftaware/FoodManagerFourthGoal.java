package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FoodManagerFourthGoal {

    @FXML
    private TextField fmfourcontactinput;

    @FXML
    private Label fmfourcontactlabel;

    @FXML
    private TextField fmfouriteminput;

    @FXML
    private Label fmfouritemslabel;

    @FXML
    private TextField fmfournameinput;

    @FXML
    private Label fmfournamelabel;

    @FXML
    private AnchorPane fmfourpage;

    @FXML
    private Label fmfourtitle;

    @FXML
    private TableColumn<?, ?> fmsupplierslist;

    @FXML
    void fmfourbackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

    }

    @FXML
    void fmfoursubmitbutton(ActionEvent event) {

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

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

public class FoodManagerThirdGoal {

    @FXML
    private TextField fmthreebcountinput;

    @FXML
    private Label fmthreebcountlabel;

    @FXML
    private TextField fmthreedcountinput;

    @FXML
    private Label fmthreedcountlabel;

    @FXML
    private TextField fmthreelcountinput;

    @FXML
    private Label fmthreelcountlabel;

    @FXML
    private AnchorPane fmthreepage;

    @FXML
    private TextField fmthreetcountinput;

    @FXML
    private Label fmthreetcountlabel;

    @FXML
    private Label fmthreetitle;

    @FXML
    void fmthreebackbutton(ActionEvent event) throws IOException { switchScene("DashboardFoodManager.fxml", event);

    }

    @FXML
    void fmthreesubmitbutton(ActionEvent event) {

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

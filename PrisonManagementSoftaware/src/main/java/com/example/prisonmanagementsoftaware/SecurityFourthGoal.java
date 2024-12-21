package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SecurityFourthGoal {

    @FXML
    private DatePicker smfourdateinput;

    @FXML
    private Label smfourdatelabel;

    @FXML
    private TextField smfourequipmentidinput;

    @FXML
    private Label smfourequipmentidlabel;

    @FXML
    private TextArea smfourissueinput;

    @FXML
    private Label smfourissuelabel;

    @FXML
    private AnchorPane smfourpage;

    @FXML
    private TextField smfourtimeinput;

    @FXML
    private Label smfourtimelabel;

    @FXML
    private Label smfourtitle;

    @FXML
    void smfouralarms(ActionEvent event) {

    }

    @FXML
    void smfourbackbutton(ActionEvent event)  throws IOException {switchScene("DashboardSecurity.fxml", event);

    }

    @FXML
    void smfourcameras(ActionEvent event) {

    }

    @FXML
    void smfourlocks(ActionEvent event) {

    }

    @FXML
    void smfoursavereportbutton(ActionEvent event) {

    }

    @FXML
    void smfourupdatebutton(ActionEvent event) {

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

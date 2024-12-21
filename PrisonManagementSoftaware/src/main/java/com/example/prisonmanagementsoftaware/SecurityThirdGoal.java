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

public class SecurityThirdGoal {

    @FXML
    private DatePicker smthreedateinput;

    @FXML
    private Label smthreedatelabel;

    @FXML
    private AnchorPane smthreepage;

    @FXML
    private TextField smthreepageinput;

    @FXML
    private Label smthreeplacelabel;

    @FXML
    private TextField smthreestaffinput;

    @FXML
    private Label smthreestafflabel;

    @FXML
    private TextField smthreetimeinput;

    @FXML
    private Label smthreetimelabel;

    @FXML
    private Label smthreetitle;

    @FXML
    private TextField smthreetypeinput;

    @FXML
    private Label smthreetypelabel;

    @FXML
    void smthreebackbutton(ActionEvent event)  throws IOException {switchScene("DashboardSecurity.fxml", event);

    }

    @FXML
    void smthreeschedulebutton(ActionEvent event) {

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

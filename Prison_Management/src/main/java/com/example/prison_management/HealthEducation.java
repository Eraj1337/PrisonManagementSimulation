package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HealthEducation {

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private TextField timeTextField;

    @FXML
    private TextField topicTextField;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("OfficerDashBoard.fxml",event,"DashBoard");

    }

    @FXML
    void healthEduButton(ActionEvent event) {

    }

    @FXML
    void logoutButton(ActionEvent event) {

    }

    @FXML
    void workshopButton(ActionEvent event) {

    }

}

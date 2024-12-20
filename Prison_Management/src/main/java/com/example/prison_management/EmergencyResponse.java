package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class EmergencyResponse {

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private TextField idTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    void backOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Officer-DashBoard.fxml",event,"DashBoard");

    }

    @FXML
    void transportDetailsOnAction(ActionEvent event) {

    }

}

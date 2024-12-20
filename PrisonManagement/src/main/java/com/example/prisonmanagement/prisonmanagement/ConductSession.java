package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ConductSession {

    @FXML
    private TextArea counselingReasonTextArea;

    @FXML
    private DatePicker sessionDob;

    @FXML
    private TextField sessionTime;

    @FXML
    public void conductSessionBackOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Rehabiliation-Officer.fxml", actionEvent, "Home");
    }

    @FXML
    public void submitOA(ActionEvent actionEvent) {
    }
}

package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class JailerViewDisciplinaryActionSceneController {

    @FXML
    private TextField prisonerNameTextField;

    @FXML
    private DatePicker incidentDateDatePicker;

    @FXML
    private TextField incidentTimeHourTextField;

    @FXML
    private TextField incidentTimeMinuteTextField;

    @FXML
    private TextField violationTypeTextField;

    @FXML
    private TextField actionTypeTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextArea evidenceTextArea;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void updateDetailsButtonOnClick(ActionEvent event) {

    }

}

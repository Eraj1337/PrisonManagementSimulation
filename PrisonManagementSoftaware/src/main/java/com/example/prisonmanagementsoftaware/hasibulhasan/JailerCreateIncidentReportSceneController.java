package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class JailerCreateIncidentReportSceneController {

    @FXML
    private TextField reportTitleTextField;

    @FXML
    private DatePicker incidentDateDatePicker;

    @FXML
    private TextField incidentTimeHourTextField;

    @FXML
    private TextField incidentTimeMinuteTextField;

    @FXML
    private TextField locationTextField;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextArea evidenceTextArea;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void submitButtonOnClick(ActionEvent event) {

    }

}

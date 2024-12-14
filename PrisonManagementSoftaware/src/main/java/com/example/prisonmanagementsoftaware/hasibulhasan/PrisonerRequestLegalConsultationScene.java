package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class PrisonerRequestLegalConsultationScene {

    @FXML
    private Label prisonerNameLabel;

    @FXML
    private Label prisonerIdLabel;

    @FXML
    private RadioButton appealRadioButton;

    @FXML
    private ToggleGroup consultReasonToggleGroup;

    @FXML
    private RadioButton newEvidenceRadioButton;

    @FXML
    private ToggleGroup consultReasonToggleGroup1;

    @FXML
    private RadioButton paroleRadioButton;

    @FXML
    private ToggleGroup consultReasonToggleGroup2;

    @FXML
    private TextArea additionalInformationTextArea;

    @FXML
    private DatePicker preferredDateDatePicker;

    @FXML
    private TextField preferredTimeHourTextField;

    @FXML
    private TextField preferredTimeMinuteTextField;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void submitButtonOnClick(ActionEvent event) {

    }

}

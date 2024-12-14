package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrisonerWorkAssignmentRequestSceneController {

    @FXML
    private Label prisonerNameLabel;

    @FXML
    private Label prisonerIdLabel;

    @FXML
    private TextField workTypeTextField;

    @FXML
    private TextField workTimeStartHourTextField;

    @FXML
    private TextField workTimeStartMinuteTextField;

    @FXML
    private TextField workTimeEndHourTextField;

    @FXML
    private TextField workTimeEndMinuteTextField;

    @FXML
    private CheckBox sundayCheckBox;

    @FXML
    private CheckBox saturdayCheckBox;

    @FXML
    private CheckBox fridayCheckBox;

    @FXML
    private CheckBox thursdayCheckBox;

    @FXML
    private CheckBox wednesdayCheckBox;

    @FXML
    private CheckBox mondayCheckBox;

    @FXML
    private CheckBox tuesdayCheckBox;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void submitButtonOnClick(ActionEvent event) {

    }

}

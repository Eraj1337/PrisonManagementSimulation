package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class JailerCreateBehaviorReportSceneController {

    @FXML
    private Label titleLabel;

    @FXML
    private Label prisonerNameLabel;

    @FXML
    private Label prisonerIdLabel;

    @FXML
    private TextField reportTitleTextField;

    @FXML
    private ComboBox<?> reportOverviewComboBox;

    @FXML
    private Label dateIssuedLabel;

    @FXML
    private Label dateUpdatedLabel;

    @FXML
    private TextArea reportDetailsTextArea;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void submitButtonOnClick(ActionEvent event) {

    }

}

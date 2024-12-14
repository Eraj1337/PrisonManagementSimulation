package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class JailerPrisonerParoleEligibilityManagementSceneController {

    @FXML
    private TableView<?> behaviorReportTableView;

    @FXML
    private TableColumn<?, ?> reportIdTableColumn;

    @FXML
    private TableColumn<?, ?> reportTitleTableColumn;

    @FXML
    private TableColumn<?, ?> dateIssuedTableColumn;

    @FXML
    private TableColumn<?, ?> dateUpdatedTableColumn;

    @FXML
    private TableColumn<?, ?> reportOverviewTableColumn;

    @FXML
    private Label prisonerNameLabel;

    @FXML
    private Label sentenceDurationLabel;

    @FXML
    private Label timeServedLabel;

    @FXML
    private CheckBox eligibleForParoleCheckBox;

    @FXML
    private ComboBox<Prisoner> prisonerIdComboBox;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void createReportButtonOnClick(ActionEvent event) {

    }

    @FXML
    void eligibleForParoleCheckBoxOnClick(ActionEvent event) {

    }

    @FXML
    void loadPrisonerDataButtonOnClick(ActionEvent event)
    {

        Prisoner prisoner1 = new Prisoner("000001", "Prisoner 1", "prisoner1@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);
        Prisoner prisoner2 = new Prisoner("000002", "Prisoner 2", "prisoner2@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);
        Prisoner prisoner3 = new Prisoner("000003", "Prisoner 3", "prisoner3@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);
        Prisoner prisoner4 = new Prisoner("000004", "Prisoner 4", "prisoner4@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);

        prisonerIdComboBox.getItems().clear();

        prisonerIdComboBox.getItems().add(prisoner1);
        prisonerIdComboBox.getItems().add(prisoner2);
        prisonerIdComboBox.getItems().add(prisoner3);
        prisonerIdComboBox.getItems().add(prisoner4);
    }

    @FXML
    void prisonerIdComboBoxOnItemSelected(ActionEvent event) {

    }

    @FXML
    void viewSelectedReportButtonOnClick(ActionEvent event) {

    }

}

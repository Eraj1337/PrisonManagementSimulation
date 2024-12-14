package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class JailerPrisonerRecordManagementSceneController {

    @FXML
    private TableView<Prisoner> allPrisonersTableView;

    @FXML
    private TableColumn<Prisoner, String> prisonerIdTableColumn;

    @FXML
    private TableColumn<Prisoner, String> prisonerNameTableColumn;

    @FXML
    private TableColumn<Prisoner, String> crimeNameTableColumn;

    @FXML
    private TableColumn<Prisoner, String> dateOfAdmissionTableColumn;

    @FXML
    private TableColumn<Prisoner, String> emergencyContactTableColumn;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void viewParoleEligibilityButtonOnClick(ActionEvent event) {

    }

    @FXML
    void viewPrisonerButtonOnClick(ActionEvent event) {

    }

    @FXML
    void loadButtonOnClick(ActionEvent event)
    {
        prisonerIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("prisonerId"));
        prisonerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("prisonerName"));
        crimeNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("crimeName"));
        dateOfAdmissionTableColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfAdmission"));
        emergencyContactTableColumn.setCellValueFactory(new PropertyValueFactory<>("emergencyContact"));

        Prisoner prisoner1 = new Prisoner("000001", "Prisoner 1", "prisoner1@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);
        Prisoner prisoner2 = new Prisoner("000002", "Prisoner 2", "prisoner2@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);
        Prisoner prisoner3 = new Prisoner("000003", "Prisoner 3", "prisoner3@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);
        Prisoner prisoner4 = new Prisoner("000004", "Prisoner 4", "prisoner4@email.com", "password", "Theft", "12345", "23/12/2000", "1/1/2024", 3, 4, 5, 1, 1, 2, false);

        // remove all previous records to avoid duplicate data
        allPrisonersTableView.getItems().clear();

        allPrisonersTableView.getItems().add(prisoner1);
        allPrisonersTableView.getItems().add(prisoner2);
        allPrisonersTableView.getItems().add(prisoner3);
        allPrisonersTableView.getItems().add(prisoner4);
    }

}

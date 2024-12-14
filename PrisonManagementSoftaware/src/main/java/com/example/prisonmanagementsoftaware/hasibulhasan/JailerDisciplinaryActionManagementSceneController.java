package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class JailerDisciplinaryActionManagementSceneController {

    @FXML
    private TableView<?> disiplinaryActionTableView;

    @FXML
    private TableColumn<?, ?> prisonerNameTableColumn;

    @FXML
    private TableColumn<?, ?> incidentDateTableColumn;

    @FXML
    private TableColumn<?, ?> incidentTimeTableColumn;

    @FXML
    private TableColumn<?, ?> violationTypeTableColumn;

    @FXML
    private TableColumn<?, ?> actionTypeTableColumn;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void viewDisciplinaryActionButtonOnClick(ActionEvent event) {

    }

}

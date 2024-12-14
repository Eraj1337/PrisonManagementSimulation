package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class JailerVisitorScheduleManagementSceneController {

    @FXML
    private TableView<?> visitorScheduleTableView;

    @FXML
    private TableColumn<?, ?> visitorNameTableColumn;

    @FXML
    private TableColumn<?, ?> prisonerNameTableColumn;

    @FXML
    private TableColumn<?, ?> dateOfVisitTableColumn;

    @FXML
    private TableColumn<?, ?> visitStartTimeTableColumn;

    @FXML
    private TableColumn<?, ?> visitEndTimeTableColumn;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void viewScheduleButtonOnClick(ActionEvent event) {

    }

}

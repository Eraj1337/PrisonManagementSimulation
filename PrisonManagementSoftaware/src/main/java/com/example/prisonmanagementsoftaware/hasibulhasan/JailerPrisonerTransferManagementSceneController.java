package com.example.prisonmanagementsoftaware.hasibulhasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class JailerPrisonerTransferManagementSceneController {

    @FXML
    private TableView<?> allPrisonerTransferTableView;

    @FXML
    private TableColumn<?, ?> prisonerIdTableColumn;

    @FXML
    private TableColumn<?, ?> prisonerNameTableColumn;

    @FXML
    private TableColumn<?, ?> currentLocationTableColumn;

    @FXML
    private TableColumn<?, ?> newLocationTableColumn;

    @FXML
    private TableColumn<?, ?> transferReasonTableColumn;

    @FXML
    void backButtonOnClick(ActionEvent event) {

    }

    @FXML
    void createTransferRequestButtonOnClick(ActionEvent event) {

    }

    @FXML
    void viewTransferButtonOnClick(ActionEvent event) {

    }

}

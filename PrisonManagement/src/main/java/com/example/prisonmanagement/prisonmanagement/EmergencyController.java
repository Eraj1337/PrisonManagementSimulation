package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmergencyController {

    @FXML
    private TableView<?> emergencyTableView;

    @FXML
    private TableColumn<?, ?> equipmentNameColumn;

    @FXML
    private TableColumn<?, ?> quantityColumn;

    @FXML
    void backButton(ActionEvent event) {

    }

}

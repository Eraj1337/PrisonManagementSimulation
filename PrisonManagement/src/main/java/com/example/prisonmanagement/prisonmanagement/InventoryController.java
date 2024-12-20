package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class InventoryController {

    @FXML
    private TableView<?> inventoryTableView;

    @FXML
    private TableColumn<?, ?> itemNameColumn;

    @FXML
    private TableColumn<?, ?> itemQuantityColumn;

    @FXML
    void addItemButton(ActionEvent event) {

    }

    @FXML
    void backButton(ActionEvent event) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Maintenance-Staff.fxml", event, "Home");

    }

    @FXML
    void removeItemButton(ActionEvent event) {

    }

}

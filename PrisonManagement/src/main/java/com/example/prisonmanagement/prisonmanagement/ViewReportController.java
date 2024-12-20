package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ViewReportController {
    @javafx.fxml.FXML
    private TableView reportTable;
    @javafx.fxml.FXML
    private TableColumn detailsColumn;
    @javafx.fxml.FXML
    private TableColumn nameColumn;
    @javafx.fxml.FXML
    private TableColumn idColumn;

    @Deprecated
    public void viewReportOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Maintenance-Staff.fxml", actionEvent, "Home");
    }
}

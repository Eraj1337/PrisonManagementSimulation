package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class TrainingController {
    @javafx.fxml.FXML
    private TableColumn trainingSessionNameColumn;
    @javafx.fxml.FXML
    private TableColumn trainingSessionTimeColumn;
    @javafx.fxml.FXML
    private TableView TrainingTableView;
    @javafx.fxml.FXML
    private TableColumn trainingSessionEnrolledColumn;

    @javafx.fxml.FXML
    public void showTrainingSessionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Maintenance-Staff.fxml", actionEvent, "Home");
    }
}
package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class TrainingController {

    @FXML
    private TableView<?> TrainingTableView;

    @FXML
    private TableColumn<?, ?> trainingSessionEnrolledColumn;

    @FXML
    private TableColumn<?, ?> trainingSessionNameColumn;

    @FXML
    private TableColumn<?, ?> trainingSessionTimeColumn;

    @FXML
    void viewTrainingButton(ActionEvent event) {

    }

}

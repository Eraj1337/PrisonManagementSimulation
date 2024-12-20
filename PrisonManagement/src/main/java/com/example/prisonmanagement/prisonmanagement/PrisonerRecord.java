package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class PrisonerRecord {

    @FXML
    private TableColumn<?, ?> ageViewColumn;

    @FXML
    private TableColumn<?, ?> genderViewColumn;

    @FXML
    private TableColumn<?, ?> inmateIdView;

    @FXML
    private TableView<?> inmateTableView;

    @FXML
    private TableColumn<?, ?> nameColumnView;

    @FXML
    private TableColumn<?, ?> rehabilationColumn;

    @FXML
    private TableView<?> rehabilitionPlanTableView;

    @FXML
    private TextArea textField;

    @FXML
    void enterRecords(ActionEvent event) {

    }

    @FXML
    void updateBtn(ActionEvent event) {

    }

    @FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Rehabiliation-Officer.fxml", actionEvent, "Home");
    }
}

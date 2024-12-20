package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SessionActivites {

    @FXML
    private TableView<?> activitiesTableView;

    @FXML
    private TableColumn<?, ?> sessionDateColumn;

    @FXML
    private TableColumn<?, ?> sessionEnrolledColumn;

    @FXML
    private TableColumn<?, ?> sessionNameColumn;

    @FXML
    void sessionBtn(ActionEvent event) {

    }

    @FXML
    void sessionTextArea(MouseEvent event) {

    }

    @FXML
    public void backOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Rehabiliation-Officer.fxml", actionEvent, "Home");
    }
}

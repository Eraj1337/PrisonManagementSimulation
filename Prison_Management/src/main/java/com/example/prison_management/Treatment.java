package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Treatment {

    @FXML
    private TableColumn<?, ?> dogaseInfoColumnView;

    @FXML
    private TableColumn<?, ?> frequencyInfoColumnView;

    @FXML
    private TextField healthrecordTextField;

    @FXML
    private TableView<?> infoTableView;

    @FXML
    private TextField injuryTextField;

    @FXML
    private TableColumn<?, ?> nameInfoColumnView;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Officer-DashBoard.fxml",event,"DashBoard");

    }

    @FXML
    void logoutButton(ActionEvent event) {

    }

    @FXML
    void reportButton(ActionEvent event) {

    }

}

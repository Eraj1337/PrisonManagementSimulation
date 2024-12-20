package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class RulesController {

    @FXML
    private TextArea txtRules;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Visitor.fxml",event,"DashBoard");

    }

}

package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Support {

    @FXML
    private TextField inmateAgetextField;

    @FXML
    private TextField inmateNameTextField;

    @FXML
    private TextField mentalHealthAssesmentTextField;

    @FXML
    private ComboBox<?> treatmentFieldComboBox;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("OfficerDashBoard.fxml",event,"DashBoard");

    }

    @FXML
    void treatmentButton(ActionEvent event) {

    }

}

package com.example.prison_management;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Feedback {

    @FXML
    void submitOnAction(ActionEvent event) throws IOException {

    }

    @FXML
    public void backOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene("Visitor.fxml",actionEvent,"visitor");
    }
}

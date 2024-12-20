package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class OfficerDashboard {

    @FXML
    void SupportButtononclick(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Support.fxml",event,"viewsSupport");

    }


    @FXML
    void emergencyResponsButtononclick(ActionEvent event) {

    }

    @FXML
    void healthMonitorButtononclick(ActionEvent event) {

    }

    @FXML
    void programButtononclickm(ActionEvent event) {

    }

    @FXML
    void treatmentButtononclick(ActionEvent event) {

    }

}


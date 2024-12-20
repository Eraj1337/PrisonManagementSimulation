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
    void emergencyResponsButtononclick(ActionEvent event)  throws IOException {
        SceneSwitcher.switchScene("Emergency-Response.fxml",event,"viewEmergencyResponse");

    }

    @FXML
    void healthMonitorButtononclick(ActionEvent event)  throws IOException {
        SceneSwitcher.switchScene("Health-Monitor.fxml",event,"viewHealthMonitor");

    }

    @FXML
    void programButtononclickm(ActionEvent event) {

    }

    @FXML
    void treatmentButtononclick(ActionEvent event)  throws IOException {
        SceneSwitcher.switchScene("Treatment.fxml",event,"viewsTreatment");

    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene("DashBoard.fxml",actionEvent,"viewDashboard");
    }
}


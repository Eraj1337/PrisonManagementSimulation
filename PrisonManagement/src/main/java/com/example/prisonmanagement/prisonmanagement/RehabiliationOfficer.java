package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class RehabiliationOfficer {

    @FXML
    void conductSession(ActionEvent event) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Conduct-Session.fxml", event, "Session");

    }

    @FXML
    void famiyInformation(ActionEvent event) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Family-Information.fxml", event, "Family Information");

    }

    @FXML
    void sessionActivities(ActionEvent event) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Session-Activites.fxml", event, "Activites");

    }

    @FXML
    void viewPrisonRecord(ActionEvent event) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Prisoner-Record.fxml", event, "Prisoner Record");

    }

    @FXML
    public void logOutOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("DashBoard.fxml", actionEvent, "Home");
    }
}

package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;

import java.io.IOException;

public class MaintenanceStaff
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewReport(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("View-Report.fxml", actionEvent, "Report");


    }

    @javafx.fxml.FXML
    public void inventoryOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Inventory.fxml", actionEvent, "Inventory");

    }

    @javafx.fxml.FXML
    public void emergencyPreparednessOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Emergency-Preparedness.fxml", actionEvent, "Emergency Preparedness");
    }

    @javafx.fxml.FXML
    public void trainingOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("Training.fxml", actionEvent, "Training");
    }

    @javafx.fxml.FXML
    public void logOutOA(ActionEvent actionEvent) throws IOException {
        com.example.prison_management.SceneSwitcher.switchScene("DashBoard.fxml", actionEvent, "DashBoard");
    }
}
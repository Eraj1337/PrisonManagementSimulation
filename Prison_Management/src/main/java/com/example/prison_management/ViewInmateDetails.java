package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class ViewInmateDetails {

    @FXML
    private Label lblCaseNumber;

    @FXML
    private Label lblCellBlockNumber;

    @FXML
    private Label lblCrimeDetails;

    @FXML
    private Label lblFacilityName;

    @FXML
    private Label lblInmateAge;

    @FXML
    private Label lblInmateGender;

    @FXML
    private Label lblInmateID;

    @FXML
    private Label lblInmateName;

    @FXML
    private Label lblParoleEligibility;

    @FXML
    private Label lblSentenceDuration;

    @FXML
    private Label lblTimeServed;

    @FXML
    private Label lblVisitingHours;

    @FXML
    void backButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Visitor.fxml",event,"DashBoard");

    }

}

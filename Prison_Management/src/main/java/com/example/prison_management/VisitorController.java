package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class VisitorController {

    @FXML
    void bookScheduleButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Book-Schedule.fxml",event,"viewsBookSchedule");


    }

    @FXML
    void feedbackButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Feedback.fxml",event,"viewFeedback");

    }

    @FXML
    void rulesRegulationsButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("Rules.fxml",event,"viewRules");


    }

    @FXML
    void viewInmateInfoButton(ActionEvent event) throws IOException {
        SceneSwitcher.switchScene("View-inmate-details.fxml",event,"viewInmate");

    }

    @FXML
    void viewScheduledVisitsButton(ActionEvent event)  throws IOException {
        SceneSwitcher.switchScene("view_scheduled_visit.fxml",event,"viewScheduled");

    }

    @FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchScene("DashBoard.fxml",actionEvent,"viewDashBoard");
    }
}
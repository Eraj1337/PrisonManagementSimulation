package com.example.prisonmanagement.prisonmanagement;

import com.example.prison_management.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DashBoard {
    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userIdtextField;
    @FXML
    private ComboBox userTyperComboBox;
    @javafx.fxml.FXML
    public void initialize() { userTyperComboBox.getItems().addAll("Maintenance Staff", "Rehabilitation Officer");
    };
    @FXML
    void forgetPassButtononclick(ActionEvent event) {

    }

    @FXML
    void loginButtononclick(ActionEvent event)  throws IOException {
        String userId = userIdtextField.getText();
        String password = passwordTextField.getText();
        String userTyperComboBoxValue = (String) userTyperComboBox.getValue();

        if (userId.isEmpty ()) {
            showAlert("Validation Error", "Please Enter a Valid User ID");
            return;
        }
        if (password.isEmpty ()) {
            showAlert("Validation Error", "Please enter a Valid Password");
            return;
        }
        if (userTyperComboBoxValue == null) {
            showAlert("Validation Error", "Please select Valid UserType");
            return;
        }
        if (userId.equals ("2230907") && password.equals("1234") && userTyperComboBoxValue.equals("Maintenance Staff")){
            SceneSwitcher.switchScene("Maintenance-Staff.fxml",event,"DashBoard");

        } else if (userId.equals ("2230207") && password.equals("4321") && userTyperComboBoxValue.equals("Rehabilitation Officer")){
            SceneSwitcher.switchScene("Rehabiliation-Officer.fxml",event,"DashBoard");

        } else{
            showAlert("Login Failed", "Invalid User Id or Password");

        }


    }
    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
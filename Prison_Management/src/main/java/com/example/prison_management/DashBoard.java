package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    public void initialize() {
        userTyperComboBox.getItems().addAll("visitor", "Medical Officer");
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
            showAlert("Validation Error", "Please enter a Valid Password")
            return
        }


    }

}

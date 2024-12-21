package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class FoodController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private ComboBox typeCombobox;
    @javafx.fxml.FXML
    private TextField foodNameTextField;

    @javafx.fxml.FXML
    public void initialize() {typeCombobox.getItems().addAll("Rice", "Chicken", "Beef","Mutton");


    }

    @javafx.fxml.FXML
    public void submitOnAction(ActionEvent actionEvent) {
        String foodName = foodNameTextField.getText().trim();
        String type = typeCombobox.getValue().toString();
        String date = dateDatePicker.getValue().toString();

    }
}
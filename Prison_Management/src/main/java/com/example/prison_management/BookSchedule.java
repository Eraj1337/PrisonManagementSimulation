package com.example.prison_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BookSchedule {

    @FXML
    private TableView<?> bookScheduleinfoTableview;

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private TableColumn<?, ?> dateinfocolumn;

    @FXML
    private TextField timeTextField;

    @FXML
    private TableColumn<?, ?> timeinfocolumn;

    @FXML
    private TextField visitorNameTextField;

    @FXML
    private TableColumn<?, ?> visitorNameinfocolumn;

    @FXML
    void verifyandconfirmButton(ActionEvent event) {

    }

}

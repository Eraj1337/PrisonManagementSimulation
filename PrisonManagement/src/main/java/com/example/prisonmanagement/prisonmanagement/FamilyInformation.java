package com.example.prisonmanagement.prisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class FamilyInformation {

    @FXML
    private TableColumn<?, ?> addressColumn;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private TableColumn<?, ?> familyNameColumn;

    @FXML
    private TableView<?> familyTableView;

    @FXML
    private TextArea familyTextArea;

    @FXML
    private TableColumn<?, ?> numberColumn;

    @FXML
    void deleteBtn(ActionEvent event) {

    }

    @FXML
    void updateBtn(ActionEvent event) {

    }

}

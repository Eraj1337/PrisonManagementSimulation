module com.example.prisonmanagement.prisonmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prisonmanagement.prisonmanagement to javafx.fxml;
    exports com.example.prisonmanagement.prisonmanagement;
}
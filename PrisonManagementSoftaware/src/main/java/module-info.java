module com.example.prisonmanagementsoftaware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prisonmanagementsoftaware to javafx.fxml;
    exports com.example.prisonmanagementsoftaware;
}
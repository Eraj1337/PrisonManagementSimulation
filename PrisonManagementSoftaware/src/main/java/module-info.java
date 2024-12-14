module com.example.prisonmanagementsoftaware {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prisonmanagementsoftaware to javafx.fxml;
    opens com.example.prisonmanagementsoftaware.hasibulhasan to javafx.fxml;
    exports com.example.prisonmanagementsoftaware;
    exports com.example.prisonmanagementsoftaware.hasibulhasan;
}
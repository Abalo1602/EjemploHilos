module com.example.ejemplohilos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplohilos to javafx.fxml;
    exports com.example.ejemplohilos;
}
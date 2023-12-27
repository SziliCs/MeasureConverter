module com.example.measureconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.measureconverter to javafx.fxml;
    exports com.example.measureconverter;
}
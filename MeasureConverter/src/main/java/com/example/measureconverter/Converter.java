package com.example.measureconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Converter {

    @FXML
    private TextField Kilometer;

    @FXML
    private TextField Merfold;

    @FXML
    private TextField KilometerPerOra;

    @FXML
    private TextField MerfoldPerOra;

    @FXML
    private TextField Kilogramm;

    @FXML
    private TextField Font;

    @FXML
    private TextField Celsius;

    @FXML
    private TextField Fahrenheit;


    @FXML
    private Button logoutbutton;


    @FXML
    protected void Delete() {
        Kilometer.setText("");
        Merfold.setText("");
        KilometerPerOra.setText("");
        MerfoldPerOra.setText("");
        Kilogramm.setText("");
        Font.setText("");
        Celsius.setText("");
        Fahrenheit.setText("");
    }


}

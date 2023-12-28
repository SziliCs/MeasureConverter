package com.example.measureconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

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

    protected void KilometerToMerfold()
    {
        if (Objects.equals(Kilometer.getText(), ""))
        {
            Merfold.setText("");
        }
        else
        {
            try
            {
                double kilometer = Double.parseDouble(Kilometer.getText());
                double merfold = kilometer * 0.621371;
                merfold = Math.round(merfold * 100.0) / 100.0;
                Merfold.setText(String.valueOf(merfold));
            }
            catch (NumberFormatException ex)
            {
                Kilometer.requestFocus();
            }
        }
    }

    protected void MerfoldToKilometer() {
        if (Objects.equals(Merfold.getText(), ""))
        {
            Kilometer.setText("");
        }
        else
        {
            try
            {
                double merfold = Double.parseDouble(Merfold.getText());
                double kilometer = merfold * 1.609344;
                kilometer = Math.round(kilometer * 100.0) / 100.0;
                Kilometer.setText(String.valueOf(kilometer));
            }
            catch (NumberFormatException ex)
            {
                Merfold.requestFocus();
            }
        }
    }

}

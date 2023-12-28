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

    protected void KilometerPOraToMerfoldPOra()
    {
        if (Objects.equals(KilometerPerOra.getText(), ""))
        {
            MerfoldPerOra.setText("");
        }
        else
        {
            try
            {
                double kmph = Double.parseDouble(KilometerPerOra.getText());
                double mph = kmph / 1.609344;
                mph = Math.round(mph * 100.0) / 100.0;
                MerfoldPerOra.setText(String.valueOf(mph));
            }
            catch (NumberFormatException ex)
            {
                KilometerPerOra.requestFocus();
            }
        }
    }

    protected void MerfoldPOraToKilometerPOra() {
        if (Objects.equals(MerfoldPerOra.getText(), ""))
        {
            KilometerPerOra.setText("");
        }
        else
        {
            try
            {
                double mph = Double.parseDouble(MerfoldPerOra.getText());
                double kmph = mph * 1.609344;
                kmph = Math.round(kmph * 100.0) / 100.0;
                KilometerPerOra.setText(String.valueOf(kmph));
            }
            catch (NumberFormatException ex)
            {
                MerfoldPerOra.requestFocus();
            }
        }
    }
    protected void KilogrammToFont()
    {
        if (Objects.equals(Kilogramm.getText(), ""))
        {
            Font.setText("");
        }
        else
        {
            try
            {
                double kilogramm = Double.parseDouble(Kilogramm.getText());
                double font = kilogramm / 0.45359237;
                font = Math.round(font * 100.0) / 100.0;
                Font.setText(String.valueOf(font));
            }
            catch (NumberFormatException ex)
            {
                Kilogramm.requestFocus();
            }
        }
    }
    protected void FontToKilogramm() {
        if (Objects.equals(Font.getText(), ""))
        {
            Kilogramm.setText("");
        }
        else
        {
            try
            {
                double font = Double.parseDouble(Font.getText());
                double kilogramm = font / 2.2046;
                kilogramm = Math.round(kilogramm * 100.0) / 100.0;
                Kilogramm.setText(String.valueOf(kilogramm));
            }
            catch (NumberFormatException ex)
            {
                Font.requestFocus();
            }
        }
    }


}

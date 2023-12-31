package com.example.measureconverter;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class HelloController {

    @FXML
    private Label message;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    protected void Login() throws IOException {
        if (Objects.equals(username.getText(), "")
                || Objects.equals(password.getText(), ""))
        {
            message.setText("Adja meg a hiányzó adatokat!");
        }
        // Felhasználó keresése adatbázisból
        else if (Database.QueryUsers(username.getText(), password.getText()))
        {
            username.setText("");
            password.setText("");
            message.setText("");
            ConverterPage();
        }
        else
        {
            message.setText("Hibás bejelentkezési adatok!");
        }
    }

    @FXML
    protected void RegistrationPage() throws IOException {
        username.setText("");
        password.setText("");
        username.requestFocus();
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("Registration.fxml"));
        Scene scene = new Scene(root.load());
        Stage registration = new Stage();
        registration.setScene(scene);
        registration.setTitle("MeasureConverter - Regisztráció");
        registration.setResizable(false);
        registration.initModality(Modality.APPLICATION_MODAL);
        registration.showAndWait();
    }

    @FXML
    protected void ConverterPage() throws IOException {
        username.setText("");
        password.setText("");
        username.requestFocus();
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("Converter.fxml"));
        Scene scene = new Scene(root.load());
        Stage converter = new Stage();
        converter.setScene(scene);
        converter.setTitle("MeasureConverter - Mértékegységátváltás");
        converter.setResizable(false);
        converter.initModality(Modality.APPLICATION_MODAL);
        converter.showAndWait();
    }

}
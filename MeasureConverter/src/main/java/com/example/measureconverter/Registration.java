package com.example.measureconverter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.util.Objects;

public class Registration {
    @FXML
    private Label message;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password1;
    @FXML
    private PasswordField password2;
    @FXML
    private Button backbutton;

    @FXML
    protected void RegistrationButton() {
        if (Objects.equals(username.getText(), "")
                || Objects.equals(password1.getText(), "")
                || Objects.equals(password2.getText(), ""))
        {
            message.setText("Adja meg a hiányzó adatokat!");
        }
        else if  (!Objects.equals(password1.getText(), password2.getText()))
        {
            message.setText("A két jelszó nem egyezik!");
        }
        else
        {
            String name = username.getText();
            String password = password1.getText();

            // Új felhasználó mentése az adatbázisba.
            Database.AddNewUser(name, password);
            message.setText("Sikeres regisztráció!");
            username.setText("");
            password1.setText("");
            password2.setText("");
            username.requestFocus();
        }
    }


    @FXML
    protected void CloseRegistration() {
        Window window = backbutton.getScene().getWindow();
        window.hide();
    }
}

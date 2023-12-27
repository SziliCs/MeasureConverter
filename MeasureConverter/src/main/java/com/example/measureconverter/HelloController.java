package com.example.measureconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label message;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void Login(ActionEvent actionEvent) {
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

}
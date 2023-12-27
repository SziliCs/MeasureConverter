package com.example.measureconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Login(ActionEvent actionEvent) {
    }

    public void RegistrationPage(ActionEvent actionEvent) {
    }
}
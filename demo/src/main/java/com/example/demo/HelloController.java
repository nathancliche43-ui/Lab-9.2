package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label nameDisplay;

    @FXML
    protected void onHelloButtonClick() {
        nameDisplay.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onFelixButtonClick() {
        nameDisplay.setText("Felix");
    }
    @FXML
    protected void onButtonOneClick() {
        welcomeText.setText("This is a test.");
    }
}

package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSecondButtonClick() {
        welcomeText.setText("This is Test 2 :)");
    }
    @FXML
    protected void onButtonOneClick() {
        welcomeText.setText("This is a test.");
    }

}

package com.example.loginmanagercleaner;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class HelloController {
    @FXML
    private Label users;
    private String userName;
    private String userId;

    @FXML
    protected void onHelloButtonClick() {
        users.setText("User Name: " + userName + " with id: "+ userId);
    }
}
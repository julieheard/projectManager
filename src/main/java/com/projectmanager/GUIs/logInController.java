package com.projectmanager.GUIs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.projectmanager.libraryFunctions.repository;

public class logInController {

    @FXML
    private TextField employeeIDField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label warningLabel;

    @FXML
    protected void logInButtonClick() {
        try {
            String employeeID = employeeIDField.getText();
            String password = new String(passwordField.getText());

            if (!repository.EmployeeLogIn(employeeID, password)) {
                warningLabel.setText("Invalid Credentials");
            } else {
                //Open next screen
                warningLabel.setText("Valid Credentials");
            }


        } catch (Exception e) {
            warningLabel.setText("Invalid Credentials");
            System.out.println(e.getCause());
        }
    }
}
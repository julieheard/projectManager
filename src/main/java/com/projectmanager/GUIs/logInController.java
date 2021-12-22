package com.projectmanager.GUIs;

import com.projectmanager.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.projectmanager.libraryFunctions.repository;
import javafx.stage.Stage;

public class logInController {

    @FXML
    private TextField employeeIDField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label warningLabel;

    @FXML
    protected void logInButtonClick(ActionEvent event) {
        try {
            String employeeID = employeeIDField.getText();
            String password = new String(passwordField.getText());

            if (!repository.EmployeeLogIn(employeeID, password)) {
                warningLabel.setText("Invalid Credentials");
            } else {
                //Open next screen
                loadMainMenu(event);
            }
        } catch (Exception e) {
            warningLabel.setText("Invalid Credentials" + e.getCause());
        }

    }
    private void loadMainMenu(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("mainMenu.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 1000, 600);
            Stage stage = new Stage();
            stage.setTitle("Mein Menu");
            stage.setScene(scene);
            stage.show();
            ((Node) event.getSource()).getScene().getWindow().hide(); //This hides the screen which is the same as deleting the elements
        }
        catch(Exception e){
            System.out.println(e.getCause());
        }

    }
}
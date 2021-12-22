package com.projectmanager.GUIs;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class mainMenuController {

    @FXML
    private Button exitButton;

    @FXML
    protected void exit(){
        System.exit(0);
    }

}

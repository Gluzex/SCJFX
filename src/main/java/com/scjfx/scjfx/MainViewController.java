package com.scjfx.scjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainViewController {
    @FXML
    private TextField txt_fld1;
    @FXML
    private ComboBox cmbx1;
    @FXML
    private Stage primaryStage;

    public void MainViewController(ActionEvent actionEvent) {
        primaryStage = SCJFXApp.getPrimaryStage();
    }

    /*public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }*/
}
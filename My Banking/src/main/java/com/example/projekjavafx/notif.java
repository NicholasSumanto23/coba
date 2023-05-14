package com.example.projekjavafx;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class notif {
    private Alert alert;

    public void errorMessage(String message){

        alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }

    public void successMessage(String message){

        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();

    }
}
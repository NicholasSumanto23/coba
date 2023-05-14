package com.example.projekjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class pindah {
    public static void pindahPage(ActionEvent event, String fxmlfile, akun acc) {
        if (acc != null) {
            try {
                FXMLLoader loader = new FXMLLoader(pindah.class.getResource(fxmlfile));
                Parent root = loader.load();
                Home home = loader.getController();
                home.usermasuk(acc);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                Parent root = FXMLLoader.load(pindah.class.getResource(fxmlfile));
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

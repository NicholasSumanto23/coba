package com.example.projekjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private TextField akses_login;

    @FXML
    private Button buat_akun;

    @FXML
    private Button cancel;

    @FXML
    private PasswordField kode_akses;
    @FXML
    private TextField name;

    @FXML
    private Button button_login;

    @FXML
    private AnchorPane login_page;

    @FXML
    private TextField no_atm;

    @FXML
    private TextField no_hp;

    @FXML
    private AnchorPane regis_page;

    @FXML
    private Button send;

    public static ArrayList<akun> getDaftarakun() {
        return daftarakun;
    }

    @FXML
    void Switch(ActionEvent event) {
        if(event.getSource()==buat_akun){
            login_page.setVisible(false);
            regis_page.setVisible(true);
        }
        if(event.getSource()==cancel){
            login_page.setVisible(true);
            regis_page.setVisible(false);
        }

    }
    @FXML
    void register(ActionEvent event) {
        if (no_atm.getText().isEmpty() || no_hp.getText().isEmpty() || kode_akses.getText().isEmpty() || name.getText().isEmpty()) {
            notif notif = new notif();
            notif.errorMessage("input kosong!");

        }else if (no_atm.getText().length() != 10){
            notif notif = new notif();
            notif.errorMessage("nomor rekening harus 10 digit angka");
        }else if (kode_akses.getText().length() != 6){
            notif notif = new notif();
            notif.errorMessage("kode akses harus 6 alphanumeric");

        }else{
            akun akun = new akun(no_atm.getText(),no_hp.getText(),kode_akses.getText(),name.getText());
            daftarakun.add(akun);
            notif notif = new notif();
            notif.successMessage("Berhasil membuat akun!");
            login_page.setVisible(true);
            regis_page.setVisible(false);
            name.setText("");
            no_atm.setText("");
            no_hp.setText("");
            kode_akses.setText("");
        }
    }

    private static ArrayList <akun> daftarakun = new ArrayList<akun>();

    @FXML
    void login_app(ActionEvent event) {
        if(akses_login.getText().isEmpty()){
            notif notif = new notif();
            notif.errorMessage("kode akses masih kosong");
        }
        else{
//       ### pindah ###
            for (akun acc : daftarakun){
                if (acc.getKode_akses().equals(akses_login.getText())){
                    if(acc.isStatus()==true){
                        notif notif = new notif();
                        notif.errorMessage("akun anda telah di blokir");
                    }else{
                        pindah.pindahPage(event,"Home.fxml",acc);
                    }
                }
            }
        }
    }

}

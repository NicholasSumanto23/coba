package com.example.projekjavafx;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class Home implements Initializable {

    @FXML
    private AnchorPane Home;

    @FXML
    private AnchorPane My_info;

    @FXML
    private Button back_home;

    @FXML
    private Button blokir;

    @FXML
    private Button blokir_confirm;

    @FXML
    private AnchorPane blokir_page;

    @FXML
    private Button cancel_confirm;

    @FXML
    private Button cancel_daftar;

    @FXML
    private Button cancel_mutasi;

    @FXML
    private Button cancel_transfersaldo;

    @FXML
    private Button cek;

    @FXML
    private TableColumn<transfer, String> colom_id;

    @FXML
    private TableColumn<transfer, String> colom_nominal;

    @FXML
    private TableColumn<transfer, String> colom_rekening;

    @FXML
    private TableColumn<transfer, String> colom_tanggal;

    @FXML
    private AnchorPane confirm_blokir;

    @FXML
    private Button daftar_menu;

    @FXML
    private ComboBox<?> daftar_rekening;

    @FXML
    private AnchorPane daftar_transfer;

    @FXML
    private TextField daftar_tujuan;

    @FXML
    private Button home_blokir;

    @FXML
    private Button home_tranfer;

    @FXML
    private Button info;

    @FXML
    private ComboBox<?> jenis_transfer;

    @FXML
    private Button kirim_daftar;

    @FXML
    private Button kirim_nominal;

    @FXML
    private PasswordField kode_confirm;

    @FXML
    private Button logout;

    @FXML
    private Button mutasi;

    @FXML
    private AnchorPane mutasi_page;

    @FXML
    private Text nama;

    @FXML
    private Text nama1;

    @FXML
    private Text no_rekening;

    @FXML
    private Text no_rekening1;

    @FXML
    private TextField nominal;

    @FXML
    private Button setting;

    @FXML
    private TableView<?> table_mutasi;

    @FXML
    private Button transfer;

    @FXML
    private Button transfer_menu;

    @FXML
    private AnchorPane transfer_page;

    @FXML
    private AnchorPane transfersaldo;

    @FXML
    private Text welcome;



    private akun acc;
    void usermasuk(akun akun){
        this.acc = akun;
        welcome.setText("Selamat datang " + akun.getName() + "!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setJenis_transfer();
    }
    @FXML
    void Switch(ActionEvent event) {
        if(event.getSource()==info || event.getSource()==cancel_mutasi){
            Home.setVisible(false);
            My_info.setVisible(true);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(false);
            transfersaldo.setVisible(false);


        }else if(event.getSource()==mutasi) {
            Home.setVisible(false);
            My_info.setVisible(false);
            mutasi_page.setVisible(true);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(false);
            transfersaldo.setVisible(false);
            setTable_mutasi();


        } else if (event.getSource()==back_home || event.getSource()==home_blokir || event.getSource()==home_tranfer) {
            Home.setVisible(true);
            My_info.setVisible(false);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(false);
            daftar_transfer.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(false);
            transfersaldo.setVisible(false);

        } else if (event.getSource()==setting || event.getSource()==cancel_confirm) {
            Home.setVisible(false);
            My_info.setVisible(false);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(true);
            confirm_blokir.setVisible(false);
            transfer.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(false);
            transfersaldo.setVisible(false);
            nama.setText(this.acc.getName());
            no_rekening.setText((this.acc.getNo_rekening()));


        }else if (event.getSource()==blokir) {
            Home.setVisible(false);
            My_info.setVisible(false);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(true);
            daftar_transfer.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(false);
            nama1.setText(this.acc.getName());
            no_rekening1.setText((this.acc.getNo_rekening()));

        }else if (event.getSource()==cancel_daftar || event.getSource()==transfer || event.getSource()==cancel_transfersaldo){
            Home.setVisible(false);
            My_info.setVisible(false);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(false);
            daftar_transfer.setVisible(false);
            transfer_page.setVisible(true);
            daftar_transfer.setVisible(false);
            transfersaldo.setVisible(false);

        }else if (event.getSource()==daftar_menu) {
            Home.setVisible(false);
            My_info.setVisible(false);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(false);
            daftar_transfer.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(true);
            transfersaldo.setVisible(false);

        } else if (event.getSource()==transfer_menu) {
            Home.setVisible(false);
            My_info.setVisible(false);
            mutasi_page.setVisible(false);
            blokir_page.setVisible(false);
            confirm_blokir.setVisible(false);
            daftar_transfer.setVisible(false);
            transfer_page.setVisible(false);
            daftar_transfer.setVisible(false);
            transfersaldo.setVisible(true);
            setDaftar_rekening();

        }
    }

    @FXML
    void cek_saldo(ActionEvent event) {
        notif Saldo = new notif();
        Saldo.successMessage(LocalDate.now()+"\n"+acc.getNo_rekening()+" "+formatRupiah(acc.getSaldo()));
    }
    @FXML
    void keluar(ActionEvent event) {
        pindah.pindahPage(event,"loghin.fxml",null);
    }
    public static String formatRupiah(int nominal) {
        String str = String.valueOf(nominal);
        Double rupiah = Double.parseDouble(str);
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);
        return formatRupiah.format(rupiah);
    }
    @FXML
    void blokir(ActionEvent event) {
        if (kode_confirm.getText().isEmpty()) {
            notif kodeblokir = new notif();
            kodeblokir.errorMessage("kode akses anda kosong!");
        } else if (kode_confirm.getText().equals(this.acc.getKode_akses())) {
            this.acc.setStatus(true);
            notif kodeblokir = new notif();
            kodeblokir.successMessage("akun berhasil di blokir!");
            pindah.pindahPage(event, "loghin.fxml", null);
        }
    }
    private String[] jenis1 = {"Antar Rekening","Antar Bank"};
    void setJenis_transfer (){
        List<String> jenis = new ArrayList<>();
        for(String data : jenis1){
            jenis.add(data);
        }
        ObservableList listdata = FXCollections.observableArrayList(jenis);
        jenis_transfer.setItems(listdata);
    }

    @FXML
    void  daftartujuan() {
        if (daftar_tujuan.getText().isEmpty() || jenis_transfer.getSelectionModel().isEmpty()) {
            notif daftar = new notif();
            daftar.errorMessage("input daftar masih kosong!");
        } else if (daftar_tujuan.getText().equals(this.acc.getNo_rekening())) {
            notif daftar = new notif();
            daftar.errorMessage("nomor rekening tidak valid!");
        } else {
            for (akun data : HelloController.getDaftarakun()) {
                if (daftar_tujuan.getText().equals(data.getNo_rekening())) {
                    data.setJenis(jenis_transfer.getSelectionModel().getSelectedItem().toString());
                    this.acc.getManages().add(data.getNo_rekening());
                    notif daftar = new notif();
                    daftar.successMessage("daftar berhasil di tambahkan!");
                    daftar_tujuan.setText("");
                    break;
                }
            }
        }
    }

    @FXML
    void transfer(ActionEvent event) {
        if(nominal.getText().isEmpty() || daftar_rekening.getSelectionModel().isEmpty()){
            notif daftar = new notif();
            daftar.errorMessage("input harus di isi!");

        } else{
            if(this.acc.getSaldo()>= Integer.parseInt(nominal.getText())){
                for(akun acc :HelloController.getDaftarakun()){
                    if (daftar_rekening.getSelectionModel().getSelectedItem().toString().equals(acc.getNo_rekening())){
                        this.acc.setSaldo(this.acc.getSaldo() - Integer.parseInt(nominal.getText()));
                        acc.setSaldo(acc.getSaldo() + Integer.parseInt(nominal.getText()));
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        LocalDateTime now = LocalDateTime.now();
                        transfer tf = new transfer(acc.getNo_rekening(),formatRupiah(Integer.parseInt(nominal.getText())),dtf.format(now));
                        this.acc.getTransfers().add(tf);
                        transfer tf2 = new transfer(this.acc.getNo_rekening(),formatRupiah(Integer.parseInt(nominal.getText())),dtf.format(now));
                        acc.getTransfers().add(tf2);
                        notif trans = new notif();
                        trans.successMessage("Transfer berhasil!"+ "\nke rekening :" + acc.getNo_rekening() +" "+ acc.getName() + "\n sebesar :" + formatRupiah(Integer.parseInt(nominal.getText())));
                        nominal.setText("");

                    }
                    }
            }else {
                    notif notrans = new notif();
                    notrans.errorMessage("Saldo tidak mencukupi!");
            }

        }

    }
    void setDaftar_rekening(){
        List<String> daftar = new ArrayList<>();
        for(String data:this.acc.getManages()){
            for(akun acc:HelloController.getDaftarakun()){
                if(acc.getNo_rekening().equals(data)){
                    daftar.add(data);
                }
            }
        }
        ObservableList data_tujuan = FXCollections.observableArrayList(daftar);
        daftar_rekening.setItems(data_tujuan);
    }
    void setTable_mutasi(){
        List<transfer> mutasi = new ArrayList<>();
        for(transfer tf : this.acc.getTransfers() ) {
            mutasi.add(tf);
        }
            colom_id.setCellValueFactory(new PropertyValueFactory<transfer, String>("id"));
            colom_nominal.setCellValueFactory(new PropertyValueFactory<transfer, String>("nominal"));
            colom_rekening.setCellValueFactory(new PropertyValueFactory<transfer, String>("no_rekening"));
            colom_tanggal.setCellValueFactory(new PropertyValueFactory<transfer, String>("tanggal"));
            ObservableList datatrans = FXCollections.observableArrayList(mutasi);
            table_mutasi.setItems(datatrans);

    }
}

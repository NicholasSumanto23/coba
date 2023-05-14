package com.example.projekjavafx;

public class transfer {
    private int id;
    private String no_rekening;
    private String nominal;
    private String tanggal;
    private int nextidtransfer = 1;


    public transfer(String no_rekening, String nominal, String tanggal) {
        this.id = nextidtransfer;
        this.no_rekening = no_rekening;
        this.nominal = nominal;
        this.tanggal = tanggal;
        nextidtransfer ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo_rekening() {
        return no_rekening;
    }

    public void setNo_rekening(String no_rekening) {
        this.no_rekening = no_rekening;
    }

    public String getNominal() {
        return nominal;
    }

    public void setNominal(String nominal) {
        this.nominal = nominal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}

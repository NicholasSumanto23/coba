package com.example.projekjavafx;

import java.util.ArrayList;

public class akun {
    private String no_rekening;
    private String no_hp;
    private String kode_akses;
    private int saldo;
    private String name;
    private boolean status = false;
    private String jenis;

    private ArrayList<transfer> transfers = new ArrayList<transfer>();

    private ArrayList<String> manages = new ArrayList<String>();

    public String getNo_rekening() {
        return no_rekening;
    }

    public ArrayList<transfer> getTransfers() {
        return transfers;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getSaldo() {
        return saldo;
    }

    public ArrayList<String> getManages() {
        return manages;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public akun(String kartu_atm, String no_hp, String kode_akses, String name) {
        this.no_rekening = kartu_atm;
        this.no_hp = no_hp;
        this.kode_akses = kode_akses;
        this.saldo = 500000;
        this.name = name;
    }
    public String getNo_hp() {
        return no_hp;
    }

    public void setNo_hp(String no_hp) {
        this.no_hp = no_hp;
    }

    public String getKode_akses() {
        return kode_akses;
    }

    public void setKode_akses(String kode_akses) {
        this.kode_akses = kode_akses;
    }
}
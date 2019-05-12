package com.example.user.myapplication;

public class Produk {

    private String nama;
    private  int gmbr;

    public Produk(){

    }

    public Produk(String nama, int gmbr) {
        this.nama = nama;
        this.gmbr = gmbr;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGmbr() {
        return gmbr;
    }

    public void setGmbr(int gmbr) {
        this.gmbr = gmbr;
    }
}

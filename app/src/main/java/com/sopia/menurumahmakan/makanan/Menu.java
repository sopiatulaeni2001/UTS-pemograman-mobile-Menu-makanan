package com.sopia.menurumahmakan.makanan;

public class Menu {
    private String nama;
    private String makanan;
    private String harga;
    private String deskripsi;
    private int drawableRes;

    public Menu(String nama, String makanan, String harga, String deskripsi, int drawableRes) {
        this.nama = nama;
        this.makanan = makanan;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.drawableRes = drawableRes;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }
}

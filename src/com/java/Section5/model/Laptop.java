package com.java.Section5.model;

public class Laptop {
    private String hang;
    private String mau;
    private double gia;

    public Laptop() {
    }
    public Laptop(String hang, String mau, double gia) {
        this.hang = hang;
        this.mau = mau;
        this.gia = gia;
    }
    public String getHang() {
        return hang;
    }
    public String getMau() {
        return mau;
    }
    public double getGia() {
        return gia;
    }
    public void setHang(String hang) {
        this.hang = hang;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    @Override
    public String toString(){
        return "Laptop{" + "hang" + hang + "mau" + mau + "gia" + gia + "}";
    }
}

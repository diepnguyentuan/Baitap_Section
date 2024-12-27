package com.java.Section5.model;

public class Chair {
    private String maChair;
    private String tenChair;
    private String mau;
    private double gia;
    public Chair() {
    }
    public Chair(String maChair, String tenChair, String mau, double gia) {
        this.maChair = maChair;
        this.tenChair = tenChair;
        this.mau = mau;
        this.gia = gia;
    }
    public String getMaChair() {
        return maChair;
    }
    public String getTenChair() {
        return tenChair;
    }
    public String getMau() {
        return mau;
    }
    public double getGia() {
        return gia;
    }
    public void setMaChair(){
        this.maChair = maChair;
    }
    public void setTenChair(){
        this.tenChair = tenChair;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    @Override
    public String toString(){
        return "Chair {" + "maChair " + maChair + "tenChair" + tenChair + "Mau " + mau + "Gia" + gia + " }";
    }
}

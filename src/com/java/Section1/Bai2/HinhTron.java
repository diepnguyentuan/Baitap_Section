package com.java.Section1.Bai2;

public class HinhTron {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double chuVi(){
        return 2 * Math.PI * banKinh;
    }

    public double dienTich(){
        return Math.PI * banKinh * banKinh;
    }
}

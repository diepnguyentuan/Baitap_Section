package com.java.Section1.Bai2;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double chuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }
}

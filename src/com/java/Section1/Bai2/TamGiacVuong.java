package com.java.Section1.Bai2;

public class TamGiacVuong {
    private double cao;
    private double day;

    public TamGiacVuong(double cao, double day) {
        this.cao = cao;
        this.day = day;
    }

    public  double chuVi(){
        double canhHuyen = Math.sqrt(cao * cao + day * day);
        return day + cao + canhHuyen;
    }

    public double dienTich(){
        return 0.5 * cao * day;
    }
}

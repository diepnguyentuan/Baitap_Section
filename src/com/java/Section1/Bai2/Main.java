package com.java.Section1.Bai2;

public class Main {
    public static void main(String[] args) {
        HinhVuong hv = new HinhVuong(5);
        HinhTron ht = new HinhTron(5);
        HinhChuNhat hc = new HinhChuNhat(5, 6);
        TamGiacVuong tg = new TamGiacVuong(5, 6);

        System.out.println("Hinh Vuong: " + hv.chuvi() + " Dien Tich: " + hv.dienTich());
        System.out.println("Hinh Tron: " + ht.chuVi() + " Dien Tich: " + ht.dienTich());
        System.out.println("Hinh Chu Nhat: " + hc.chuVi() + " Dien Tich: " + hc.dienTich());
        System.out.println("Tam Giac Vuong: " + tg.chuVi() + " Dien Tich: " + tg.dienTich());
    }
}

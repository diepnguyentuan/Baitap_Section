package com.java.Section1.Bai1;

import java.util.Scanner;

public class TinhToan {
    public int TinhTong(int a, int b){
        return a+b;
    }
    public float TinhTong(float a, float b){
        return a+b;
    }
    public int TinhHieu(int a, int b){
        return a-b;
    }
    public float TinhHieu(float a, float b){
        return a-b;
    }
    public int TinhTich(int a, int b){
        return a*b;
    }
    public float TinhTich(float a, float b){
        return a*b;
    }
    public int TinhThuong(int a, int b){
        return a/b;
    }
    public float TinhThuong(float a, float b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "nhap 2 so");
        int a = sc.nextInt();
        int b = sc.nextInt();
        TinhToan tt = new TinhToan();
        System.out.println("Tong: " + tt.TinhTong(a, b));
        System.out.println("Hieu: " + tt.TinhHieu(a, b));
        System.out.println("Tich: " + tt.TinhTich(a, b));
        System.out.println("Thuong: " + tt.TinhThuong(a, b));
    }
}

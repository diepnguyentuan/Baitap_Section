package com.java.Section2.Bai3;

import java.util.Scanner;

public class PhanLoaiTuoi {
    public static void phanLoaiTuoi(int tuoi) {
        String loaiTuoi = (tuoi < 1) ? "Tre so sinh" :
                (tuoi <= 3) ? "Em be" :
                        (tuoi <= 18) ? "Tre em" :
                                (tuoi <= 40) ? "Nguoi lon" :
                                        (tuoi < 60) ? "Trung nien" : "Nguoi gia";

        System.out.printf("Tuoi %d thuoc tuoi: %s%n", tuoi, loaiTuoi);
    }

    public static void main(String[] args) {
        System.out.print("Nhap vao tuoi: ");
        Scanner sc = new Scanner(System.in);
        int tuoi = sc.nextInt();
        phanLoaiTuoi(tuoi);
        sc.close();
    }
}
package com.java.Section1.Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap vao so a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Can bac 2: " + Function.canBac2(a));
        System.out.println("Binh phuong 2: " + Function.binhPhuong2(a));
        System.out.println("PI x " + a + ": " + Function.PI(a));
    }
}

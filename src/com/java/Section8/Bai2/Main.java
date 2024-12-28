package com.java.Section8.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin Quoc gia: ");
        Country country = new Country();
        country.input();
        System.out.println("Nhap so sinh vien: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien " + (i + 1));
            Person p = new Person();
            p.input();
            country.addPerson(p);
        }

        System.out.println("Danh sach sinh vien VietNam:");
        country.info();
    }
}

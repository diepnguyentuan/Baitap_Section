package com.java.Section8.Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Category c = new Category();
        c.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong san pham: ");
        int n = sc.nextInt();
        Product[] p = new Product[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Product();
            p[i].input();
            p[i].setCategory(c);
        }
        for (Product pro : p) {
            pro.info();
        }
    }
}

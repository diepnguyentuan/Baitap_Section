package com.java.Section3.Bai2;

import java.util.Scanner;

public class TaoMang {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mang = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
            mang[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Mang la: ");
        for(int phanTu : mang){
            System.out.print(phanTu + " ");
        }
        System.out.println("\nTong cac phan tu trong mang: ");
        int tong = 0;
        for(int phanTu : mang){
            tong += phanTu;
        }
        System.out.println(tong);
        System.out.println("Tich cac phan tu trong mang: ");
        int tich = mang[0];
        for(int i = 1; i < n; i++){
            tich *= mang[i];
        }
        System.out.println(tich);

        int max = mang[0];
        for(int i = 1; i < n; i++){
            if(max < mang[i]){
                max = mang[i];
            }
        }
        System.out.println("Max la: " + max);

        int min = mang[0];
        for(int i = 1; i < n; i++){
            if(min > mang[i]){
                min = mang[i];
            }
        }
        System.out.println("Min la: " + min);

        System.out.println("Sap xep mang tang dan: ");
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(mang[i] > mang[j]){
                    int temp = mang[i];
                    mang[i] = mang[j];
                    mang[j] = temp;
                }
            }
            System.out.print(mang[i] + " ");
        }

    }
}

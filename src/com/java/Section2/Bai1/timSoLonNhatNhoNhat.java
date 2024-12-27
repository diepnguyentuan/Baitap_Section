package com.java.Section2.Bai1;

import java.util.Scanner;

public class timSoLonNhatNhoNhat {
    public static void main(String[] args) {
        System.out.println("Nhap vao 3 so: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        System.out.println("So lon nhat la: " + max);
        System.out.println("So nho nhat la: " + min);
    }
}

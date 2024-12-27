package com.java.Section7.Bai1.main;


import com.java.Section7.Bai1.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("student " + (i + 1) + ":");
            arr[i] = new Student();
            arr[i].input(sc);

        }
        System.out.println("Danh sach sinh vien: ");
        for(Student stu : arr){
            stu.info();
        }
    }
}

package com.java.Section5.service;

import com.java.Section5.model.CourseScore;

import java.util.Scanner;

public class Function {
    CourseScore s = new CourseScore();
    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin Student: ");
        System.out.println("Nhap id: ");
        String id = sc.nextLine();
        System.out.println("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("nhap diem: ");
        Double diem = sc.nextDouble();
        s.setId(id);
        s.setName(ten);
        s.setScore(diem);
    }
    public String inforStudent() {
        return s.toString();
    }
}

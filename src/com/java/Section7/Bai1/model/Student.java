package com.java.Section7.Bai1.model;

import java.util.Scanner;

public class Student extends Person {
    private String major;

    public Student() {
    }
    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void input(Scanner sc){
        super.input(sc);
        System.out.println("Nhap nganh hoc: ");
        this.major = sc.nextLine();
    }
    @Override
    public void info(){
        super.info();
        System.out.println("nganh hoc " + major);
    }
}

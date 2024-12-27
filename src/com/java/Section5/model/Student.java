package com.java.Section5.model;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String address;
    private String major;

    public Student() {
    }
    public Student(String id, String name, String address, String major) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.major = major;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getMajor() {
        return major;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + ", major=" + major + '}';
    }
    public void inputStudent(Scanner sc) {
        System.out.println("Nhap thong tin Student: ");
        System.out.println("Nhap id: ");
        this.id = sc.nextLine();
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("nhap dia chi: ");
        this.address = sc.nextLine();
        System.out.println("Nhap nganh hoc: ");
        this.major = sc.nextLine();
    }
    public void inforStudent() {
        System.out.println("Id: " + id);
        System.out.println("Ten: " + name);
        System.out.println("Dia chi: " + address);
        System.out.println("Nganh hoc: " + major);
    }
}

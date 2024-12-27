package com.java.Section6.model;

import java.util.Scanner;

public class School {
    private String id;
    private String name;
    private String address;

    public School() {
    }

    public School(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputSchool(Scanner sc) {
        System.out.println("Nhap id: ");
        this.id = sc.nextLine();
        System.out.println("Nhap name: ");
        this.name = sc.nextLine();
        System.out.println("Nhap address: ");
        this.address = sc.nextLine();
    }

    public void getInfo() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
    }

    @Override
    public String toString() {
        return "School{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

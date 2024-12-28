package com.java.Section8.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Category {
    private String id;
    private String name;


    public Category() {
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id: ");
        this.id = scanner.nextLine();
        System.out.println("nhap name: ");
        this.name = scanner.nextLine();
    }
    public void info(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
    }
}

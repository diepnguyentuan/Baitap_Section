package com.java.Section7.Bai2.model;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int age;

    public Employee(){

    }
    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void input(Scanner scanner){
        System.out.println("nhap id: ");
        this.id = scanner.nextLine();
        System.out.println("Nhap ten: ");
        this.name = scanner.nextLine();
        System.out.println("nhap age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }
    public void info(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

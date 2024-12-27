package com.java.Section7.Bai1.model;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void input(Scanner sc){
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = sc.nextInt();
        sc.nextLine();
    }
    public void info(){
        System.out.println("ten " + name);
        System.out.println("tuoi " + age);
    }
}

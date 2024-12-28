package com.java.Section8.Bai2;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private Country country;

    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.country = null;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Country getCountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = sc.nextInt();
    }
    public void info(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Quoc gia: " + country.getName());
    }
}

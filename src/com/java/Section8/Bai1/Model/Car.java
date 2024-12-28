package com.java.Section8.Bai1.Model;

import java.util.Scanner;

public class Car {
    private String name;
    private int price;
    private String color;
    private Person owner;

    public Car() {

    }
    public Car(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.owner = null;
    }
    public Person getOwner() {
        return owner;
    }
    public void setOwner(Person owner) {
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap gia tri: ");
        this.price = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap mau: ");
        this.color = sc.nextLine();
    }
    public void info(){
        System.out.println("Ten: " + name);
        System.out.println("Gia tri: " + price);
        System.out.println("Mau: " + color);
        if(owner != null) {
            System.out.println("Nguoi so huu: " + owner.getName());
        } else {
            System.out.println("Chua co nguoi so huu");
        }
    }
}

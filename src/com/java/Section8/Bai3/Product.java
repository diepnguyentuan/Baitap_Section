package com.java.Section8.Bai3;

import java.util.Scanner;

public class Product {
    private String id;
    private String name;
    private double price;
    private Category category;

    public Product() {
    }
    public Product(String id, String name, double price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Category getCategory() {
        return category;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void info(){
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("price: " + price);
        System.out.println("category: " + category.getName());
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id: ");
        this.id = scanner.nextLine();
        System.out.println("nhap name: ");
        this.name = scanner.nextLine();
        System.out.println("nhap price: ");
        this.price = scanner.nextDouble();
        scanner.nextLine();
    }
}

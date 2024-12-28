package com.java.Section8.Bai1.Model;

import java.util.Scanner;

public class House {
    private int numberOfFloors;
    private int numberOfRooms;
    private double price;
    private Person owner;

    public House() {

    }
    public House(int numberOfFloors, int numberOfRooms, double price) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.owner = null;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tang: ");
        this.numberOfFloors = sc.nextInt();
        System.out.println("Nhap so phong: ");
        this.numberOfRooms = sc.nextInt();
        System.out.println("Nhap gia tri: ");
        this.price = sc.nextDouble();
    }
    public void info(){
        if(owner != null) {
            System.out.println("So tang: " + numberOfFloors);
            System.out.println("So phong: " + numberOfRooms);
            System.out.println("Gia tri: " + price);
            System.out.println("Nguoi so huu: " + owner.getName());
        } else {
            System.out.println("Chua co nguoi so huu");
        }
    }
}

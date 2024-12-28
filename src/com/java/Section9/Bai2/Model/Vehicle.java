package com.java.Section9.Bai2.Model;

public class Vehicle {
    private double price;
    private int numberOfSeats;

    public Vehicle() {

    }
    public Vehicle(double price, int numberOfSeats) {
        this.price = price;
        this.numberOfSeats = numberOfSeats;
    }
    public double getPrice() {
        return price;
    }
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public void print(){
        System.out.println("Gia Ve: " + price + " $");
        System.out.println("So ghe: " + numberOfSeats);
    }
}

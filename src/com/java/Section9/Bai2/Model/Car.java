package com.java.Section9.Bai2.Model;

public class Car extends Vehicle {
    private String loaiXe;

    public Car() {

    }
    public Car(double price, int numberOfSeats, String loaiXe) {
        super(price, numberOfSeats);
        this.loaiXe = loaiXe;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Loai xe: " + loaiXe);
    }
}

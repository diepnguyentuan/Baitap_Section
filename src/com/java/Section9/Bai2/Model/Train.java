package com.java.Section9.Bai2.Model;

public class Train extends Vehicle {
    private int soToa;

    public Train() {

    }
    public Train(double price, int numberOfSeats, int soToa) {
        super(price, numberOfSeats);
        this.soToa = soToa;
    }
    public int getSoToa() {
        return soToa;
    }
    public void setSoToa(int soToa) {
        this.soToa = soToa;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("So toa: " + soToa);
    }
}


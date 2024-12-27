package com.java.Section5.model;

public class Person {
    private String maSV;
    private String ten;
    private int tuoi;

    public Person() {
    }
    public Person(String maSV, String ten, int tuoi) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
    }
    public String getMaSV() {
        return maSV;
    }
    public String getten() {
        return ten;
    }
    public int gettuoi() {
        return tuoi;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public void setten(String ten) {
        this.ten = ten;
    }
    public void settuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    @Override
    public String toString() {
        return "Person{" + "maSV=" + maSV + ", ten=" + ten + ", tuoi=" + tuoi + '}';
    }
}

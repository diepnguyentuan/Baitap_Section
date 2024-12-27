package com.java.Section5.model;

public class Table {
    private String viTri;
    private int soPhong;

    public Table() {}

    public Table(String viTri, int soPhong) {
        this.viTri = viTri;
        this.soPhong = soPhong;
    }
    public String getViTri() {
        return viTri;
    }
    public int getSoPhong() {
        return soPhong;
    }
    public void setViTri(String viTri) {
        this.viTri = viTri;
    }
    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }
    @Override
    public String toString() {
        return "Table{" + "viTri=" + viTri + ", soPhong=" + soPhong + '}';
    }
}

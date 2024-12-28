package com.java.Section8.Bai1.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    private List<House> listHouse;
    private List<Car> listCar;

    public Person() {
        this.listCar = new ArrayList<>();
        this.listHouse = new ArrayList<>();
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<House> getListHouse() {
        return listHouse;
    }
    public List<Car> getListCar() {
        return listCar;
    }
    public void setListHouse(List<House> listHouse) {
        this.listHouse = listHouse;
    }
    public void setListCar(List<Car> listCar) {
        this.listCar = listCar;
    }
    public void addHouse(House house){
        this.listHouse.add(house);
        house.setOwner(this);
    }
    public void addCar(Car car){
        this.listCar.add(car);
        car.setOwner(this);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.address = sc.nextLine();
    }
    public void info(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Dia chi: " + address);
        System.out.println("Danh sach nha: ");
        if(listHouse.isEmpty()){
            System.out.println("Khong co nha");
        } else {
            for(House house : listHouse){
                house.info();
            }
        }
        System.out.println("Danh sach xe: ");
        if(listCar.isEmpty()){
            System.out.println("Khong co xe");
        } else {
            for(Car car : listCar){
                car.info();
            }
        }
    }
}

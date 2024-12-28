package com.java.Section8.Bai1.Main;

import com.java.Section8.Bai1.Model.Car;
import com.java.Section8.Bai1.Model.House;
import com.java.Section8.Bai1.Model.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        Person person = new Person();
        person.input();
        House house = new House();
        System.out.println("Nhap so nha ban co: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println("Nhap thong tin House: ");
            house.input();
        }
        Car car = new Car();
        System.out.println("Nhap so nha ban co: ");
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println("Nhap thong tin Car: ");
            car.input();
        }

        person.addHouse(house);
        person.addCar(car);

        person.info();

        System.out.println("Thông tin House :");
        house.info();
        System.out.println("Thong tin Car :");
        car.info();
        sc.close();
    }
}

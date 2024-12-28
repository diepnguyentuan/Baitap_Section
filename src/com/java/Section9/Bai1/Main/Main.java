package com.java.Section9.Bai1.Main;

import com.java.Section9.Bai1.Model.Animal;
import com.java.Section9.Bai1.Model.Chicken;
import com.java.Section9.Bai1.Model.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void input(Animal animal) {
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        sc.nextLine();
        animal.setName(name);
        animal.setAge(age);

        if (animal instanceof Dog){
            System.out.println("Nhap loai: ");
            String breed = sc.nextLine();
            ((Dog) animal).setBreed(breed);
        } else if (animal instanceof Chicken) {
            System.out.print("Ga co dang de trung khong(co/khong): ");
            String isLayingEggsStr = sc.nextLine();
            boolean isLayingEggs = isLayingEggsStr.equalsIgnoreCase("co");
            ((Chicken) animal).setIsLayEggs(isLayingEggs);
        }
    }
    public static void info(Animal animal) {
        System.out.println("Thong tin con vat: ");
        System.out.println("Ten: " + animal.getName());
        System.out.println("Tuoi: " + animal.getAge());

        if (animal instanceof Dog){
            System.out.println("Loai: " + ((Dog) animal).getBreed());
        } else if (animal instanceof Chicken) {
            String dangDeTrung = ((Chicken) animal).getIsLayEggs() ? "Co" : "Khong";
            System.out.println("Dang de trung: " + dangDeTrung);
        }
    }
    public static void main(String[] args) {
        List<Animal> listAnimals = new ArrayList<>();
        while (true) {
            System.out.println("1. Nhap thong tin con cho: ");
            System.out.println("2. Nhap thong tin con ga: ");
            System.out.println("3. Xem thong tin con vat: ");
            System.out.println("4. Thoat: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    Dog dog = new Dog();
                    input(dog);
                    listAnimals.add(dog);
                    break;
                case "2":
                    Chicken chicken = new Chicken();
                    input(chicken);
                    listAnimals.add(chicken);
                    break;
                case "3":
                    for (Animal animal : listAnimals) {
                        info(animal);
                        System.out.println("--------------------");
                    }
                    break;
                case "4":
                    System.out.println("Thoat Chuong trinh");;
                    return;
                default:
                    System.out.println("Lua chon sai, nhap lai");
            }
        }
    }
}

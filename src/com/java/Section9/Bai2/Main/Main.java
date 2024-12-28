package com.java.Section9.Bai2.Main;

import com.java.Section9.Bai2.Model.Car;
import com.java.Section9.Bai2.Model.Train;

public class Main {
    public static void main(String[] args) {
        System.out.println("Thong tin train");
        Train train = new Train(10, 10, 2);
        train.print();

        System.out.println("Thong tin car");
        Car car = new Car(10, 10, "Mec");
        car.print();
    }
}

package com.java.Section2.Bai2;

import java.util.Scanner;

public class phuongTrinh {

    public static String giaiPhuongTrinhBacHai(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return "Phương trình có vô số nghiệm";
                } else {
                    return "Phương trình vô nghiệm";
                }
            } else {
                double x = -c / b;
                return "Phương trình có một nghiệm x = " + x;
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Phương trình có hai nghiệm phân biệt x1 = " + x1 + ", x2 = " + x2;
            } else if (delta == 0) {
                double x = -b / (2 * a);
                return "Phương trình có nghiệm kép x = " + x;
            } else {
                return "Phương trình vô nghiệm";
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        scanner.close();

        String ketQua = giaiPhuongTrinhBacHai(a, b, c);
        System.out.println(ketQua);
    }
}
package com.java.Section3.Bai1;

import java.util.Scanner;

public class VongLap {
    public class HelloWorld {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello World");
            }
        }
    }

    public class TinhTong {
        public static void main(String[] args) {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                sum += i;
            }
            System.out.println("Tổng từ 1 đến 100 là: " + sum);
        }
    }


    public class TinhGiaiThua {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số nguyên dương n: ");
            int n = scanner.nextInt();
            long factorial = 1;

            if (n < 0) {
                System.out.println("Khong co giai thua cho so am!");
            } else {
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                }
                System.out.println(n + "! = " + factorial);
            }

            scanner.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Menu dùng while
        while (true) {
            System.out.println("\n===== MENU (while) =====");
            System.out.println("1. In Hello World");
            System.out.println("2. Tính tổng từ 1 đến 100");
            System.out.println("3. Tính giai thừa");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HelloWorld.main(null);
                    break;
                case 2:
                    TinhTong.main(null);
                    break;
                case 3:
                    TinhGiaiThua.main(null);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            if (choice == 0) {
                break; // Thoát khỏi vòng lặp while
            }
        }
        // Menu dùng do-while
        do {
            System.out.println("\n===== MENU (do-while) =====");
            System.out.println("1. In Hello World");
            System.out.println("2. Tính tổng từ 1 đến 100");
            System.out.println("3. Tính giai thừa");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    HelloWorld.main(null);
                    break;
                case 2:
                    TinhTong.main(null);
                    break;
                case 3:
                    TinhGiaiThua.main(null);
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

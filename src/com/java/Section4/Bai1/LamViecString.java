package com.java.Section4.Bai1;

import java.util.Scanner;

public class LamViecString {
    public void validatePhone(String phone){
        if(phone.length() != 10){
            System.out.println("So dien thoai sai");
        }
        if(phone.charAt(0) != '0'){
            System.out.println("So dien thoai sai");
        }
        for (int i = 0; i < phone.length(); i++) {
            if(!Character.isDigit(phone.charAt(i))){
                System.out.println("So dien thoai sai");
            }
        }
        System.out.println("So dien thoai dung");
    }
    public void validatePhoneNetWork(String phone){
        String network = phone.substring(0, 3);
        switch (network) {
            case "093":
            case "93":
            case "70":
            case "79":
            case "77":
            case "76":
            case "78":
                System.out.println("Mobiphone");
                break;
            case "91":
            case "94":
            case "88":
            case "86":
                System.out.println("Vinaphone");
                break;
            case "81":
            case "82":
                System.out.println("Viettel");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

    }

    public boolean validateEmail(String email){
        if(!email.contains("@")){
            return false;
        }
        if(!email.endsWith(".gmail.com")){
            return false;
        }
        String username = email.substring(0, email.indexOf("@"));
        if (username.length() < 6){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(!Character.isLetterOrDigit(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String str = "Hello Java";
//        System.out.println(str.length());

        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap vao chuoi: ");
//        String str1 = sc.nextLine();
//        if (str.contains(str1)){
//            System.out.println("Co ton tai");
//        } else {
//            System.out.println("Khong ton tai");
//        }
//        int count = 0;
//        for (int i = 0; i < str1.length(); i++) {
//            char c = Character.toLowerCase(str1.charAt(i));
//            if(c == 'a'){
//                count++;
//            }
//        }
//        System.out.println("So a trong chuoi la: " + count);
//
//        String[] arr = str1.split("\\s+");
//        for (String s : arr) {
//            System.out.println(s);
//        }
//        System.out.println("Nhap sdt: ");
//        String phone = sc.nextLine();
        LamViecString lamViecString = new LamViecString();
//        lamViecString.validatePhone(phone);
//        lamViecString.validatePhoneNetWork(phone);
        System.out.println("Nhap email: ");
        String email = sc.nextLine();
        if (lamViecString.validateEmail(email)){
            System.out.println("Email dung");
        } else {
            System.out.println("Email sai");
        }
        sc.close();
    }
}

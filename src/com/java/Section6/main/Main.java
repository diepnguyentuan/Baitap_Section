package com.java.Section6.main;


import com.java.Section6.model.School;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        School[] lstSchool = new School[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap school " + (i + 1));
            lstSchool[i] = new School();
            lstSchool[i].inputSchool(sc);
        }
        for (School school1 : lstSchool) {
            school1.getInfo();
        }

        System.out.println("nhap ten muon tim kiem: ");
        String name = sc.next();

        Arrays.stream(lstSchool)
                .filter(school -> school.getName().contains(name))
                .findAny()
                .ifPresentOrElse(
                        school -> { Arrays.stream(lstSchool).filter(school1
                                    -> school1.getName().contains(name))
                                    .forEach(School::getInfo);
                        },
                        () -> System.out.println("Không tìm thấy!")
                );
    }
}

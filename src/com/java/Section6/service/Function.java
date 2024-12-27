package com.java.Section6.service;

import com.java.Section6.model.School;

import java.util.List;
import java.util.Scanner;

public class Function {
    public List<School> getListSchool() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten muon tim kiem: ");
        String name = sc.next();
        School school = new School();
        school.getInfo();

        school.getName();
        return null;
    }
}

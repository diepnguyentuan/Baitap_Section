package com.java.Section5.model;

import java.util.Scanner;

public class CourseScore {
    private String id;
    private String name;
    private double score;

    public CourseScore() {
    }

    public CourseScore(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CourseScore{" + "id=" + id + ", name=" + name + ", score=" + score + '}';
    }

    public void inputStudent(Scanner sc) {
        System.out.println("Nhap thong tin Student: ");
        System.out.println("Nhap id: ");
        this.id = sc.nextLine();
        System.out.println("Nhap ten: ");
        this.name = sc.nextLine();
        System.out.println("Nhap diem: ");
        this.score = sc.nextDouble();

    }

    public void inforStudent(Scanner sc) {
        System.out.println("Id: " + id);
        System.out.println("Ten: " + name);
        System.out.println("diem: " + score);
        boolean isValidScore = false;
        while (!isValidScore) {
            if (score < 5 && score >= 0) {
                System.out.println("Yeu");
                isValidScore = true;
            } else if (score >= 5 && score < 7) {
                System.out.println("TB");
                isValidScore = true;
            } else if (score >= 7 && score < 8) {
                System.out.println("K");
                isValidScore = true;
            } else if (score >= 8 && score <= 10) {
                System.out.println("G");
                isValidScore = true;
            } else if (score < 0 || score > 10) {
                System.out.println("Diem khong hop le");
                System.out.println("Nhap lai: ");
                score = sc.nextDouble();
            }
        }
    }
}

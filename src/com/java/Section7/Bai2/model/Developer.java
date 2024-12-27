package com.java.Section7.Bai2.model;

import java.util.Scanner;

public class Developer extends Employee {

    String programmingLanguage;

    public Developer() {
    }
    public Developer(String id, String name, int age, String programmingLanguage) {
        super(id, name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void input(Scanner scanner){
        super.input(scanner);
        System.out.println("nhap ngon ngu: ");
        this.programmingLanguage = scanner.nextLine();
    }
    @Override
    public void info(){
        super.info();
        System.out.println("ngon ngu: " + programmingLanguage);
    }
}

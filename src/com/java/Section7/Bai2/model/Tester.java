package com.java.Section7.Bai2.model;

import java.util.Scanner;

public class Tester extends Employee {
    String testTools;

    public Tester() {
    }
    public Tester(String id, String name, int age, String testTools) {
        super(id, name, age);
        this.testTools = testTools;
    }
    public String getTestTools() {
        return testTools;
    }
    public void setTestTools(String testTools) {
        this.testTools = testTools;
    }
    @Override
    public void input(Scanner scanner){
        super.input(scanner);
        System.out.println("nhap test tools: ");
        this.testTools = scanner.nextLine();
    }
    @Override
    public void info(){
        super.info();
        System.out.println("test tools: " + testTools);
    }


}

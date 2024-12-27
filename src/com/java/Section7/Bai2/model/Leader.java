package com.java.Section7.Bai2.model;

import java.math.BigDecimal;
import java.util.Scanner;

public class Leader extends Employee {

    int teamSize;
    BigDecimal salary;

    public Leader() {
    }
    public Leader(String id, String name, int age, int teamSize, BigDecimal salary) {
        super(id, name, age);
        this.teamSize = teamSize;
        this.salary = salary;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    public BigDecimal getSalary() {
        return salary;
    }
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("team size: " + teamSize);
        if(teamSize > 10){
            System.out.println("salary: " + (salary.add(salary.multiply(new BigDecimal("0.5")))));
        }else {
            System.out.println("salary: " + (salary.add(salary.multiply(new BigDecimal("0.1")))));
        }
    }
    @Override
    public void input(Scanner scanner){
        super.input(scanner);
        System.out.println("nhap team size: ");
        this.teamSize = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap salary: ");
        this.salary = scanner.nextBigDecimal();
        scanner.nextLine();
    }
}

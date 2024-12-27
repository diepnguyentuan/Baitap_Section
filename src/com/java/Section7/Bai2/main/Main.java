package com.java.Section7.Bai2.main;

import com.java.Section7.Bai2.model.Developer;
import com.java.Section7.Bai2.model.Leader;
import com.java.Section7.Bai2.model.Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Object> employees = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Create Employee");
            System.out.println("2. Info Developer use Java");
            System.out.println("3. Info Leader");
            System.out.println("4. Show all employees");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = validateChoiceInput(sc);


            switch (choice) {
                case 1:
                    createEmployee(sc);
                    break;
                case 2:
                    infoDeveloperJava();
                    break;
                case 3:
                    infoLeader();
                    break;
                case 5:
                    System.exit(0);
                    break;
                case 4:
                    infoAllEmployees(); // New method call
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    public static int validateChoiceInput(Scanner sc) {
        int choice ;
        while (true) {
            try {
                choice = sc.nextInt();
                sc.nextLine();
                return choice;
            }
            catch (Exception e) {
                System.out.println("Invalid input, please enter a number.");
                sc.nextLine();
            }
        }
    }
    public static void createEmployee(Scanner sc){
        System.out.println("Enter employee you want to create: ");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Leader");

        int choice1 = validateChoiceInput(sc);
        switch (choice1) {
            case 1:
                System.out.println("Enter number developer want to create: ");
                int numDev = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < numDev; i++) {
                    System.out.println("Enter information for developer " + (i + 1));
                    Developer d = new Developer();
                    d.input(sc);
                    employees.add(d);
                }
                break;
            case 2:
                System.out.println("Enter number tester want to create: ");
                int numTest = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < numTest; i++) {
                    System.out.println("Enter information for tester " + (i + 1));
                    Tester t = new Tester();
                    t.input(sc);
                    employees.add(t);
                }
                break;
            case 3:
                System.out.println("Enter number leader want to create: ");
                int numLead = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < numLead; i++) {
                    System.out.println("Enter information for leader " + (i + 1));
                    Leader l = new Leader();
                    l.input(sc);
                    employees.add(l);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static void infoDeveloperJava() {
        System.out.println("Developer using java:");
        boolean found = false;
        for (Object employee : employees) {
            if (employee instanceof Developer) {
                Developer dev = (Developer) employee;
                if (dev.getProgrammingLanguage().equals("java")) {
                    dev.info();
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("No developer use java");
        }

    }
    public static void infoLeader(){
        System.out.println("Information Leader:");
        boolean found = false;
        for (Object employee : employees) {
            if (employee instanceof Leader) {
                Leader l = (Leader) employee;
                l.info();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No leader exists!");
        }
    }

    public static void infoAllEmployees() {
        System.out.println("All Employees:");
        if(employees.isEmpty()){
            System.out.println("No employee found!");
        }
        for (Object employee : employees) {
            if (employee instanceof Developer) {
                ((Developer) employee).info();
            } else if (employee instanceof Tester) {
                ((Tester) employee).info();
            } else if (employee instanceof Leader) {
                ((Leader) employee).info();
            }
            System.out.println("--------------------");
        }
    }
}
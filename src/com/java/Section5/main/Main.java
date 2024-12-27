package com.java.Section5.main;

import com.java.Section5.model.CourseScore;
import com.java.Section5.model.Person;
import com.java.Section5.model.Student;
import com.java.Section5.service.Function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("123", "Tam", 20);
        System.out.println(p);
        System.out.println(p.getMaSV());
        Function f = new Function();
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
//        s.inputStudent(sc);
//        s.inforStudent();
        CourseScore cs = new CourseScore();
        cs.inputStudent(sc);
        cs.inforStudent(sc);
    }

}

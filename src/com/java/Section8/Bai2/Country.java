package com.java.Section8.Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String name;
    private String continent;
    private List<Person> listPerson;

    public Country() {
        this.listPerson = new ArrayList<>();
    }
    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
        this.listPerson = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public String getContinent() {
        return continent;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setContinent(String continent) {
        this.continent = continent;
    }
    public List<Person> getListPerson() {
        return listPerson;
    }
    public void setListPerson(List<Person> listPerson) {
        this.listPerson = listPerson;
    }
    public void addPerson(Person person){
        listPerson.add(person);
        person.setCountry(this);
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten quoc gia: ");
        this.name = sc.nextLine();
        System.out.println("Nhap ten chau luc: ");
        this.continent = sc.nextLine();
    }
    public void info(){
        System.out.println("Ten quoc gia: " + name);
        System.out.println("Chau luc: " + continent);
        if(listPerson != null) {
            for (Person person : listPerson) {
                person.info();
            }
        } else {
            System.out.println("Truong hoc chua co ai thuoc dat nuoc nay");
        }
    }
}

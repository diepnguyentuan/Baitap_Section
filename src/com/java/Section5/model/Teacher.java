package com.java.Section5.model;

public class Teacher {
    private String id;
    private String name;
    private String address;
    private String facility;

    public Teacher() {
    }
    public Teacher(String id, String name, String address, String facility) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.facility = facility;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getFacility() {
        return facility;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setFacility(String facility) {
        this.facility = facility;
    }
    @Override
    public String toString() {
        return "Teacher{" + "id=" + id + ", name=" + name + ", address=" + address + ", facility=" + facility + '}';
    }
}

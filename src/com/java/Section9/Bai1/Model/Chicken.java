package com.java.Section9.Bai1.Model;

public class Chicken extends Animal{
    private boolean isLayEggs;

    public Chicken() {
    }
    public Chicken(String name, int age, boolean isLayEggs) {
        super(name, age);
        this.isLayEggs = isLayEggs;
    }
    public boolean getIsLayEggs() {
        return isLayEggs;
    }
    public void setIsLayEggs(boolean isLayEggs) {
        this.isLayEggs = isLayEggs;
    }
}

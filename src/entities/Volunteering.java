package entities;

import entities.interfaces.CheckIn;

public class Volunteering implements CheckIn {
    private String name;
    private int age;
    private String CV;

    public Volunteering(String name, int age, String CV) {
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCV() {
        return CV;
    }

    @Override
    public void chekIn() {
        System.out.println(getName() + " checked in");
    }
}

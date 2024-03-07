package entities;

import entities.interfaces.CheckIn;

public class Administration extends Employee implements CheckIn {

    private double baseSalary;
    private double bonus;

    public Administration(int id, Department department, double bonus, double baseSalary) {
        super(id, department);
        this.baseSalary = baseSalary;
        this.bonus = bonus;

    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void chekIn() {
        System.out.println("Has checked in");
    }
}

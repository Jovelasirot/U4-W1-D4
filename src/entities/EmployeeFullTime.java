package entities;

import entities.interfaces.CheckIn;

public class EmployeeFullTime extends Employee implements CheckIn {
    private double monthlySalary;
    private int extraHours;
    private int payForExtraHours;

    public EmployeeFullTime
            (int id, Department department, double monthlySalary) {
        super(id, department);
        this.monthlySalary = monthlySalary;
    }

    public EmployeeFullTime
            (int id, Department department, double monthlySalary, int extraHours, int payForExtraHours) {
        super(id, department);
        this.monthlySalary = monthlySalary + extraHours * payForExtraHours;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }


    @Override
    public void chekIn() {
        System.out.println("Employee number: " + getId() + " checked in");
    }
}

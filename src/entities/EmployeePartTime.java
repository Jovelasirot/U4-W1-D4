package entities;

import entities.interfaces.CheckIn;

public class EmployeePartTime extends Employee implements CheckIn {
    private double hourlySalary;
    private int hoursWorking;

    public EmployeePartTime(int id, Department department, double hourlySalary, int hoursWorking) {
        super(id, department);
        this.hourlySalary = hourlySalary;
        this.hoursWorking = hoursWorking;
    }


    @Override
    public double calculateSalary() {
        return hourlySalary * hoursWorking;
    }


    @Override
    public void chekIn() {
        System.out.println("Employee number " + getId() + " checked in");
    }
}

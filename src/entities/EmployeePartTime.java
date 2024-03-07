package entities;

public class EmployeePartTime extends Employee {
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
}

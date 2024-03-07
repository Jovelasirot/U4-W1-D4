package entities;

public class EmployeeFullTime extends Employee {
    private double monthlySalary;
    private int extraHours;
    private int payForExtraHours;

    public EmployeeFullTime
            (int id, Department department, double monthlySalary) {
        super(id, department);
        this.monthlySalary = monthlySalary;
    }

    private EmployeeFullTime
            (int id, Department department, double monthlySalary, int extraHours, int payForExtraHours) {
        super(id, department);
        this.monthlySalary = monthlySalary + (extraHours * payForExtraHours);
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }


}

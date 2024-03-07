package entities;

public class Administration extends Employee {

    private double baseSalary;
    private double bonus;

    public Administration(int id,  Department department, double bonus, double baseSalary) {
        super(id, department);
        this.baseSalary = baseSalary;
        this.bonus = bonus;

    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

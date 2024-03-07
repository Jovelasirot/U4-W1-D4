package entities;

public abstract class Employee {

    private int id;

    private Department department;

    public Employee(int id, Department department) {
        this.id = id;
        this.department = department;
        this.department = department;
    }

    public int getId() {
        return id;
    }


    public Department getDepartment() {
        return department;
    }

    public abstract double calculateSalary();


}

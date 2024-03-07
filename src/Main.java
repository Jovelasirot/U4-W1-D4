import entities.*;

public class Main {
    public static void main(String[] args) {

        EmployeePartTime employee1 = new EmployeePartTime
                (57, Department.SALES, 20, 20);


        EmployeeFullTime employee2 = new EmployeeFullTime
                (21, Department.PRODUCTION, 1800);

        Administration employee3 = new Administration
                (1, Department.ADMINISTRATION, 10000, 2500);

        Employee[] employees =
                {employee1, employee2, employee3};

        for (Employee employee : employees) {
            System.out.println("Employee number: " + employee.getId());
            System.out.println("Department: " + employee.getDepartement());
            System.out.println("Salary: " + employee.calculateSalary() + " $");
            System.out.println("-------------------------");
            ;
        }


    }
}
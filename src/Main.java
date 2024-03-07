import entities.*;
import entities.interfaces.CheckIn;

public class Main {


    public static void main(String[] args) {

        EmployeePartTime employee1 = new EmployeePartTime
                (57, Department.SALES, 20, 20);


        EmployeeFullTime employee2 = new EmployeeFullTime
                (21, Department.PRODUCTION, 1800);

        Administration employee3 = new Administration
                (1, Department.ADMINISTRATION, 10000, 2500);

        EmployeeFullTime employeeWithExtras = new EmployeeFullTime
                (15, Department.SALES, 1500, 20, 15);


        System.out.println(employeeWithExtras.calculateSalary());

        
        Employee[] employees =
                {employee1, employee2, employee3};


//        Es1
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee number: " + employees[i].getId());
        }

        System.out.println("-------------------------");

//        Es2
        for (Employee employee : employees) {
            System.out.println("Employee number: " + employee.getId());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.calculateSalary() + " $");
            System.out.println("-------------------------");
            ;
        }

//        Es3
        Volunteering volunteer1 = new Volunteering
                ("Joe", 21, "Studied Interior Design");


        CheckIn[] checkIns = {employee1, volunteer1};

        for (int i = 0; i < checkIns.length; i++) {
            checkIns[i].chekIn();
        }
    }

}
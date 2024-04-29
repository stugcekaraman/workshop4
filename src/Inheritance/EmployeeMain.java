package Inheritance;


import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employees = employeeManager.getAll();
        for (Employee employee:employees){
            System.out.println(employee.getFirstName());
        }

        Employee employee = new Employee(5,"Büşra","Aydın", "busra@mail.com","1123", "BA");
        employeeManager.addEmployee(employee);

        Employee updatedEmployee = new Employee();
        updatedEmployee.setId(1);
        updatedEmployee.setDepartment("QA Tester");
        employeeManager.updateEmployee(updatedEmployee.getId(), updatedEmployee);

        System.out.println("---------------");

        for (Employee employee1: employees){
            System.out.println(employee1.getFirstName());
        }

        employeeManager.deleteEmployee(3);
        System.out.println("---------------------------");

        for (Employee employee1:employees){
            System.out.println(employee1.getFirstName());
        }

    }

    }


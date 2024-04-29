package Inheritance;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    public EmployeeManager(){
        employees = new ArrayList<>();
        Employee employee1 = new Employee(1,"Cavit","Çetin","cavit@mail.com","123","QA Tester");
        employees.add(employee1);
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void deleteEmployee(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employees.remove(employee);
                break;
            }
        }
    }

    public void updateEmployee(int id, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, updatedEmployee);
                break;
            }
        }
    }

    public Employee getById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
    public List<Employee> getAll() {
        return employees;
    }
}

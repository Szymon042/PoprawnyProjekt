package org.example;

import java.util.HashMap;

public class EmployeeManager {
    private final HashMap<Integer, Employee> employees;

    public HashMap<Integer, Employee> getEmployees() {
        return this.employees;
    }

    public EmployeeManager(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(String firstName, String lastName, String position, int salary) {
        Employee employee = new Employee(firstName, lastName, position, salary);
        Integer keyEmployee = employee.getEmployeeID();
        this.employees.put(keyEmployee, employee);
    }
    public void removeEmployee(Employee employee) {
        if (this.employees.containsKey(employee.getEmployeeID())) {
            this.employees.remove(employee.getEmployeeID());
        } else {
            System.out.println("Nie znaleziono pracownika");
        }

    }





}

package service;

import domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class AppCompany {

    public static void reportEmployeeData(List<Employee> employees) {
        System.out.println(employees);
    }

    public List<Employee> getFromEmployeesLessThanThirty(List<Employee> employees) {
        List<Employee> employeesLessThanThirty = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).isLessThanThirty()) {
                employeesLessThanThirty.add(employees.get(i));
            }
        }

        return employeesLessThanThirty;
    }

    public int countEmployees(List<Employee> employees) {
        return employees.size();
    }
}

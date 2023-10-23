package Model;


import Data.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Liskov substitution principle(класс не изменяет поведение родителя,
 * но расширяет его поведение и может его заменить)
 */

public class EmployeeService implements DataService {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public Employee create(String fio, String birthDate, int employeeId) {
        Employee employee = new Employee(fio, birthDate, employeeId);
        employeeList.add(employee);
        return employee;
    }

    @Override
    public List<Employee> read() {
        return employeeList;
    }
}
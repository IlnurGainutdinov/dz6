package View;

import Data.Employee;

import java.util.List;

public class EmployeeView {

    public void showEmployeeList(List<Employee> employeeList){
        System.out.println(employeeList);
    }

    public void showResult(Employee employee) {
        if(employee != null){
            System.out.println("Работник добавлен в список " + employee);
        }
    }
}

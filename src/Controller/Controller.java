package Controller;

import Data.Employee;
import Model.DataService;
import Model.EmployeeService;
import View.EmployeeView;

public class Controller {
    DataService dataService;
    EmployeeView employeeView;

    public Controller() {
        this.dataService = new EmployeeService();
        this.employeeView = new  EmployeeView();
    }

    public void sendRequest(String fio, String birthDate,int employeeId) {
        Employee employee = dataService.create(fio, birthDate,employeeId);
        employeeView.showResult(employee);

    }


}

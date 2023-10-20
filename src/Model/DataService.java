package Model;

import Data.Employee;

import java.util.List;

public interface DataService {
    Employee create(String fio, String birthDate,int employeeId);
    List<Employee> read();

}

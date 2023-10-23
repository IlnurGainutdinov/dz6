package Model;

import Data.Employee;

import java.util.List;

/**
 * Open-closed principle(интерфейс закрыт для модификаций, открыт для расширений)
 */

/**
 * Interface segregation principle(реализуем только то что нужно)
 */

public interface DataService {
    Employee create(String fio, String birthDate,int employeeId);
    List<Employee> read();

}

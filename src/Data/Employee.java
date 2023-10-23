package Data;

/**
 * Single responsibility principle(класс имеет одну ответственность и это информация о работнике)
 */
public class Employee {

    private int employeeId;
    private String fio;
    private String birthDate;

    public Employee(String fio, String birthDate,int employeeId) {
        this.employeeId = employeeId;
        this.fio = fio;
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return ": " +
                "табельный номер = " + employeeId +
                ", ФИО = " + fio  +", Дата рождения = " + birthDate;
    }
}

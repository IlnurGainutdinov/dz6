package Data;

public class Employee {

    int employeeId;
    String fio;
    String birthDate;

    public Employee(String fio, String birthDate,int employeeId) {
        this.employeeId = employeeId;
        this.fio = fio;
        this.birthDate = birthDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return ": " +
                "табельный номер = " + employeeId +
                ", ФИО = " + fio  +", Дата рождения = " + birthDate;
    }
}

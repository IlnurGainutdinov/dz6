import Controller.Controller;
import Data.Employee;
import View.EmployeeView;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.sendRequest("Tom", "01.01.1986", 1);

    }
}
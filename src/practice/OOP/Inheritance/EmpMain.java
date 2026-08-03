package practice.OOP.Inheritance;

public class EmpMain {

    public static void main(String[] args) {
        Employee emp = new Employee("bob", "engineer");
        EmpManager mgr = new EmpManager("zen", "management", 5);

        emp.checkIn();
        mgr.checkIn();

        emp.work();
        mgr.work();

        emp.printInfo();
        mgr.printInfo();

    }


}

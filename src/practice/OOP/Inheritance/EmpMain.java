package practice.OOP.Inheritance;

public class EmpMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Zhang san", 35000);
        EmpManager mgr = new EmpManager("Lee si", 40000, 10000);

        emp.printInfo();
        mgr.printInfo();

        System.out.println();

        emp.applyRaise(10);
        mgr.applyRaise(20);

        emp.printInfo();
        mgr.printInfo();
    }
}

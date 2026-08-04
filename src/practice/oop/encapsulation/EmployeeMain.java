package practice.oop.encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("433A", 40000);
        e1.printInfo();

        e1.setSalary(35000);
        e1.printInfo();

        e1.applyRaise(10);
        e1.printInfo();

        e1.applyRaise(5.5);
        e1.printInfo();
    }
}

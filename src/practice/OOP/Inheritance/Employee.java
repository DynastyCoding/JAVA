package practice.OOP.Inheritance;

public class Employee {

    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void applyRaise(int percent) {
        salary += salary * percent / 100;
    }

    public void printInfo() {
        System.out.println(name + " |salary " + salary);
    }

}

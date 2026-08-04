package practice.oop.encapsulation;

public class Employee {
    private String empId;
    private int salary;

    public Employee(String empId, int salary) {
        this.empId = empId;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 25000;
            System.out.println("Can't less than 0, set to 25,000.");
        }
    }

    public String getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 25000;
            System.out.println("Need to greater than 0, set to 25000.");
        }
    }

    public void printInfo() {
        System.out.println(empId + " | " + salary);
    }

    public void applyRaise(double percent) {
        salary = (int) (salary * (1 + percent / 100));
    }

}

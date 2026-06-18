package practice.OOP.Inheritance;

public class EmpManager extends Employee {

    private int bonus;

    public EmpManager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public void applyRaise(int percent) {
        super.applyRaise(percent);
        bonus += bonus * percent / 100;
    }

    @Override
    public void printInfo() {
        System.out.println(name + " | 底薪:"
                + salary + " | 獎金:"
                + bonus + " | 總薪資:"
                + getSalary());
    }
}

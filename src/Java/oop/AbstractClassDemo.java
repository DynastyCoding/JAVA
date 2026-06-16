package Java.oop;

abstract class Mymath {

    abstract int add(int n1, int n2);

    abstract int mul(int n1, int n2);

    void output() {
        System.out.println("My calculator.");
    }
}

class MyTest extends Mymath {
    @Override
    int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    int mul(int n1, int n2) {
        return n1 * n2;
    }
}

public class MathExercise {
    public static void main(String[] args) {

        Mymath obj = new MyTest();
        obj.output();
        System.out.println("add: " + obj.add(3, 8));
        System.out.println("mul: " + obj.mul(3, 8));
    }
}

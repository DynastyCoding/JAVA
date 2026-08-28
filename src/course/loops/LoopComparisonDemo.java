package course.loops;

public class LoopComparisonDemo {

    public static void p1() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void p2() {

        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i * 2;
        }
        System.out.println(i);
    }

    public static void p3() {

        for (int i = 1; i <= 9; i++) {
            System.out.printf("5 x %d = %d%n", i, 5 * i);
        }

    }

    public static void p4() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 3);
        }

    }

    public static void p5() {

        int i = 20;
        while (i >= 0) {
            System.out.println(i);
            i = i-2;
        }
        System.out.println(i);
    }

    public static void p6() {

        int i = 50;
        while (i >= 10) {
            System.out.println(i);
            i = i-3;
        }
        System.out.println(i);
    }


    public static void main(String[] args) {
        p6();
    }
}

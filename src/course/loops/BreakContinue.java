package course.loops;

import java.util.Scanner;

public class BreakContinue {

    public static void p1() {

        for (int i = 2; i <= 30; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                System.out.printf("find  the perfect square: %d%n", i);
                break;
            }
        }
    }

    public static void p2() {

        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void p3() {

        int i = 10;
        while (true) {
            System.out.println(100 / i);
            i -= 2;
            if (i <= 0) {
                System.out.println("error,Invalid divisor.");
                break;
            }
        }
    }

    public static void p4() {

        for (int i = 1; i <= 10; i++) {

            if ((i * 5) % 2 == 0) {
                continue;
            }
            System.out.printf("5 x %d = %d%n", i, i * 5);
        }
    }

    public static void p5() {

        for (int i = 1; i <= 100; i++) {

            if (i % 6 == 0 && i % 8 == 0) {
                System.out.printf("find %d%n", i);
                break;
            }
        }
    }

    public static void p6() {

        Scanner in = new Scanner(System.in);

        int i = 1;

        while (i <= 5) {
            System.out.println("please enter your password:");
            String pw = in.nextLine();
            System.out.printf("input %d times.%n", i);
            if (pw.equals("qwerqeq")) {
                System.out.println("logging successful!");
                break;
            }
            i++;
        }
        if (i > 5) {
            System.out.println("system has been locked.");
        }
    }

    public static void main(String[] args) {
        p6();

    }
}

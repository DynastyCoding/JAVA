package practice;

import java.util.Scanner;

public class WhileDrills {

    static Scanner in = new Scanner(System.in);

    public static void p01() {

        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void p02() {

        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }

    public static void p03() {

        int i = 1;
        while (i <= 10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void p04() {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void p05() {

        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    public static void p06() {
        System.out.println("Please enter a integer:");
        int n = in.nextInt();
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }

    public static void p07() {

        int n = 1;
        while (n != 0) {
            System.out.println("Please enter a integer:");
            n = in.nextInt();
            System.out.printf("Your input is:%d.%n", n);
        }
    }

    // Increasing triangle | i++
    public static void p08() {
        int i = 1;
        while (i <= 4) {
            int j = i;
            while (j >= 1) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
    }

    // Increasing triangle | i--
    public static void p09() {
        int i = 4;
        while (i >= 1) {
            int j = 1;
            while (j <= (5 - i)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    // Decreasing triangle | i++
    public static void p10() {
        int i = 1;
        while (i <= 4) {
            int j = 1;
            while (j <= (5 - i)) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Decreasing triangle | i--
    public static void p11() {
        int i = 4;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public static void p12() {

        int ans = (int) (Math.random() * 100 + 1);
        int guess;
        int count = 1;

        do {
            System.out.println("please enter a number:");
            guess = in.nextInt();
            if (guess > ans) {
                System.out.println("You guess too big.");
            } else if (guess < ans) {
                System.out.println("You guess too small");
            } else {
                System.out.printf("Guess right! you guess %d times.", count);
            }
            count += 1;
        } while (guess != ans);
    }

    public static void p13() {

        int i = 1;
        while (i <= 10) {
            System.out.printf("%d, ", (int) Math.pow(i, 2));
            i++;
        }
    }

    public static void p14() {

        System.out.println("Please enter a integer:");
        int n = in.nextInt();
        int a = 1;
        int sum = 1;
        System.out.print("1");
        while (a < n) {
            System.out.printf(" + %d", a + 1);
            a++;
            sum += a;
        }
        System.out.printf("= %d", sum);
    }

    public static void p14_2() {
        System.out.println("please enter a integer:");
        int n = in.nextInt();
        int a = 1;
        int sum = 0;
        while (a <= n) {
            sum += a;
            if (a > 1) {
                System.out.print(" + ");
            }
            System.out.print(a);
            a++;
        }
        System.out.printf(" = %d", sum);
    }

    public static void p15() {

        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void p16() {
        System.out.println("Please input first integer:");
        int a = in.nextInt();
        System.out.println("Please input second integer:(need more than first integer)");
        int b = in.nextInt();
        int range = a;

        while (range <= b) {
            if (range % 3 == 0) {
                System.out.println(range);
            }
            range++;
        }
    }

    public static void p17() {

        int i = 5;
        while (i >= 1) {
            System.out.println("*".repeat(i));
            i--;
        }
    }

    public static void main(String[] args) {
        p14_2();
    }
}

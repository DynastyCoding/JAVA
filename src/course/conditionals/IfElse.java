package course.conditionals;

import java.util.Scanner;

public class IfElse {

    static Scanner in = new Scanner(System.in);

    public static void ifElse01() {

        System.out.println("please enter your score:");
        int score = in.nextInt();
        if (score >= 60) {
            System.out.println("Pass. No need to retake.");
        } else {
            System.out.println("Fail. Need to retake.");
        }
        in.close();
    }

    public static void ifElse02() {

        System.out.println("please inter a integer:");
        int number = in.nextInt();
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        in.close();
    }

    public static void ifElse03() {

        System.out.println("please enter your parking time:");
        int hr = in.nextInt();

        if (hr <= 1) {
            System.out.println("free");
        } else {
            System.out.printf("parking fee:%d", (hr - 1) * 30);
        }
        in.close();
    }

    public static void ifElse04() {

        System.out.println("please enter your deposits:");
        int deposits = in.nextInt();

        if (deposits >= 50000) {
            System.out.printf("deposit amounts:%d%n" + "interest rate:3%%%n" + "interest:%f", deposits, deposits * 1.03);
        } else {
            System.out.printf("deposit amounts:%d%n" + "interest rate:2%%%n" + "interest:%f", deposits, deposits * 1.02);
        }
        in.close();
    }

    public static void ifElse05() {

        System.out.println("please enter your purchase amount:");
        int amount = in.nextInt();
        System.out.println("are you member(T/F)?:");
        boolean member = in.nextBoolean();

        if (member) {
            System.out.printf("amount after discount is %f", amount * 0.9);
        } else {
            System.out.printf("price is %d", amount);
        }
        in.close();
    }

    public static void main(String[] args) {
        ifElse01();
        ifElse02();
        ifElse03();
        ifElse04();
        ifElse05();
    }
}

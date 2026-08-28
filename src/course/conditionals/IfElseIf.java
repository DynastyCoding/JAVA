package course.conditionals;

import java.util.Scanner;

public class IfElseIf {

    static Scanner in = new Scanner(System.in);

    public static void ifElseIf01() {

        System.out.println("please enter your score:");
        int score = in.nextInt();

        System.out.printf("your score is:%d%n", score);

        if (score >= 95 && score <= 100) {
            System.out.println("特優獎學金10000元");
        } else if (score >= 90) {
            System.out.println("優等獎學金5000元");
        } else if (score >= 85) {
            System.out.println("甲等獎學2000元");
        } else {
            System.out.println("無獎學金");
        }
        in.close();
    }

    public static void ifElseIf02() {

        System.out.println("please enter your travel distance:");
        int dist = in.nextInt();

        System.out.printf("your travel distance: is:%d%n", dist);

        if (dist <= 2) {
            System.out.println("Fixed basic fee $100");
        } else if (dist <= 10) {
            System.out.printf("travel distance is:%d", (dist - 2) * 15 + 100);
        } else if (dist <= 20) {
            System.out.printf("travel distance is:%d", (dist - 10) * 20 + 220);
        } else {
            System.out.printf("travel distance is:%d", (dist - 20) * 25 + 420);
        }
        in.close();
    }

    public static void ifElseIf03() {

        System.out.println("please enter your body temperature:");

        int bt = in.nextInt();
        System.out.printf("your body temperature is:%d%n", bt);

        if (bt < 36) {
            System.out.println("body temperature is too low," +
                    "recommended to keep warm.");
        } else if (bt < 37.5) {
            System.out.println("normal body temperature.");
        } else if (bt < 38) {
            System.out.println("mild fever, please rest or seeking medical.");
        } else {
            System.out.println("fever,seeking medical immediately.");
        }
        in.close();
    }

    public static void ifElseIf04() {

        System.out.println("please enter your height:");
        double h = in.nextDouble();
        System.out.println("please enter your weight:");
        double w = in.nextDouble();

        double bmi = w / Math.pow(h / 100, 2);
        System.out.printf("Your bmi is:%f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight");
        } else if (bmi < 24) {
            System.out.println("You are normal weight");
        } else if (bmi < 27) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obesity");
        }
        in.close();
    }

    public static void ifElseIf05() {

        System.out.println("please enter your age:");
        int ages = in.nextInt();
        System.out.printf("your age is :%d%n", ages);

        if (ages < 12) {
            System.out.println("Child ticket: $150");
        } else if (ages < 65) {
            System.out.println("Adult ticket: $250");
        } else {
            System.out.println("Silver-hair ticket: $180");
        }
        in.close();
    }

    public static void main(String[] args) {
        ifElseIf01();
        ifElseIf02();
        ifElseIf03();
        ifElseIf04();
        ifElseIf05();
    }
}

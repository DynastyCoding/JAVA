package course.conditionals;

import java.util.Scanner;

public class IfStatementDemo {

    static Scanner in = new Scanner(System.in);

    public static void if01() {

        System.out.println("please enter your sales amount:");
        int amount = in.nextInt();

        System.out.printf("Sales amount=%d%n", amount);
        if (amount >= 10000) {
            System.out.println("Congratulations on achieving the target!");
        }
        in.close();
    }

    public static void if02() {

        System.out.println("please enter your driving speed：");
        int speed = in.nextInt();

        System.out.printf("your driving speed is ：%d%n", speed);
        if (speed > 60) {
            System.out.printf("you have exceed the speed limit, fined %d billion.", (speed - 60) * 100);
        }
        in.close();
    }

    public static void if03() {

        System.out.println("please enter your purchase amount:");
        int amount = in.nextInt();

        System.out.printf("purchase amount:%d,shipping fee:%d,total amount:%d%n",
                amount, 80, amount + 80);
        if (amount >= 1000) {
            System.out.printf("Shipping costs have been deducted,After discount amount=%d", amount);
        }
        in.close();
    }

    public static void if04() {

        System.out.println("please enter your electricity consumption:");
        int degree = in.nextInt();
        System.out.printf("electricity consumption is:%d,%n electricity bill is %d%n", degree, degree * 4);

        if (degree >= 500) {
            System.out.printf("electricity bill discount 10%% ,after discount is %f dollar", degree * 0.9);
        }
        in.close();
    }

    public static void if05() {

        System.out.println("please enter your annual spending amount:");
        int spending = in.nextInt();
        System.out.printf("your annual spending is: %d%n", spending);

        if (spending >= 50000) {
            System.out.println("VIP members enjoy exclusive gifts(Worth 1000).");
        }
        in.close();
    }

    public static void main(String[] args) {
        if01();
        if02();
        if03();
        if04();
        if05();
    }
}

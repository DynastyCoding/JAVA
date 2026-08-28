package course.conditionals;

import java.util.Scanner;

public class SwitchStatementDemo {

    static Scanner in = new Scanner(System.in);

    public static void switch01() {

        System.out.println("please enter number:");
        int num = in.nextInt();

        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("輸入錯誤");
        }
    }

    public static void switch02() {

        System.out.println("please enter month number:");
        int m = in.nextInt();

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("%d月有31天.", m);
                break;
            case 4, 6, 9, 11:
                System.out.printf("%d月有30天.", m);
                break;
            case 2:
                System.out.println("2月有28天.");
                break;
            default:
                System.out.println("month isn't exist");
        }
    }

    public static void switch03() {

        System.out.println("type transportation");
        String tra = in.nextLine();

        switch (tra) {
            case "bicycle":
                System.out.println("30 km/h");
                break;
            case "car":
                System.out.println("200 km/h");
                break;
            case "train":
                System.out.println("300 km/h");
                break;
            case "airplane":
                System.out.println("900 km/h");
                break;
            default:
                System.out.println("unknown transportation");
        }
    }

    public static void switch04() {

        System.out.println("please enter your score:");
        String score = in.nextLine();

        switch (score) {
            case "A":
                System.out.println("90-100 points, excellent");
                break;
            case "B":
                System.out.println("80-89 points, good");
                break;
            case "C":
                System.out.println("70-79 points, pass");
                break;
            case "D":
                System.out.println("60-69 points, need to improve");
                break;
            case "F":
                System.out.println("fail");
                break;
            default:
                System.out.println("invalid grade");
        }
    }

    public static void switch05() {

        System.out.println("type Operators:");
        char ope = in.next().charAt(0);

        int a = 10, b = 5;

        switch (ope) {

            case '+':
                System.out.printf("10+5=%d", a + b);
                break;
            case '-':
                System.out.printf("10-5=%d", a - b);
                break;
            case '*':
                System.out.printf("10*5=%d", a * b);
                break;
            case '/':
                System.out.printf("10/5=%d", a / b);
                break;
            default:
                System.out.println("unsupported operations");
        }
    }

    public static void main(String[] args) {
        switch01();
        switch02();
        switch03();
        switch04();
        switch05();
    }
}

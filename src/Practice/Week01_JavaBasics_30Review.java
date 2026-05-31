package Practice;

import java.util.Scanner;

public class Week01_JavaBasics_30Review {
    public static void q1() {
        int score = 85;
        System.out.println(score);
    }

    public static void q2() {
        double price = 199.99;
        System.out.printf("%.1f%n", price);
    }

    public static void q3() {
        char grade = 'A';
        System.out.println(grade);
    }

    public static void q4() {
        boolean isPass = true;
        System.out.println(isPass);
    }

    public static void q5() {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.printf("a=%d,b=%d%n", a, b);
    }

    public static void q6() {
        int x = 15;
        int y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }

    public static void q7() {
        int num = 10;
        num = (num + 5) * 2;
        System.out.println(num);
    }

    public static void q8() {
        int a = 10;
        int b = 3;
        double c = (double) a / b;
        System.out.printf("%.2f%n", c);
    }

    public static void q9() {
        int m = 7, n = 2;
        n--;
        System.out.printf("m=%d,n=%d%n", --m, n);
    }

    public static void q10() {
        int score = 75;
        System.out.println((score >= 60) ? "及格" : "不及格");
    }

    public static void q11() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your name:");
        String name = in.nextLine();
        System.out.printf("Hello,%s%n", name);
        in.close();
    }

    public static void q12() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter first integer:");
        int a = in.nextInt();
        System.out.println("please enter Second integer:");
        int b = in.nextInt();
        System.out.printf("sum = %d%n", a + b);
        in.close();
    }

    public static void q13() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a float:");
        double flo = in.nextDouble();
        System.out.printf("%f square is:%.2f%n", flo, Math.pow(flo, 2));
        in.close();
    }

    public static void q14() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a integer:");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        in.close();
    }

    public static void q15() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a character:");
        char ch = in.next().charAt(0);
        System.out.printf("%c ASCII code= %d%n", ch, (int) ch);
        in.close();
    }

    public static void q16() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your age:");
        int age = in.nextInt();

        if (age >= 18) {
            System.out.println("adult");
        } else {
            System.out.println("minor");
        }
        in.close();
    }

    public static void q17() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a integer:");
        int inte = in.nextInt();

        if (inte >= 0) {
            System.out.printf("absolute value is:%d%n", inte);
        } else {
            System.out.printf("absolute value is:%d%n", -inte);
        }
        in.close();
    }

    public static void q18() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter three integer:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a >= b && a >= c) {
            System.out.printf("Maximum is %d%n", a);
        } else if (b >= a && b >= c) {
            System.out.printf("Maximum is %d%n", b);
        } else {
            System.out.printf("Maximum is %d%n", c);
        }
        in.close();
    }

    public static void q19() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a year:");
        int year = in.nextInt();

        System.out.println(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                ? "leap year" : "normal year");
        in.close();
    }

    public static void q20() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your shopping amount:");
        int amo = in.nextInt();

        if (amo < 1000) {
            System.out.printf("original price:%d%n", amo);
        } else if (amo < 2000) {
            System.out.printf("discounted amount:%.2f%n", amo * 0.9);
        } else {
            System.out.printf("discounted amount:%.2f%n", amo * 0.8);
        }
        in.close();
    }

    public static void q21() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your score:");
        int sco = in.nextInt();

        if (sco >= 90 && sco <= 100) {
            System.out.println("your grade is A");
        } else if (sco >= 80 && sco <= 89) {
            System.out.println("your grade is B");
        } else if (sco >= 70 && sco <= 79) {
            System.out.println("your grade is C");
        } else if (sco >= 60 && sco <= 69) {
            System.out.println("your grade is D");
        } else if (sco >= 0 && sco <= 59) {
            System.out.println("your grade is F");
        } else {
            System.out.println("invalid score");
        }
        in.close();
    }

    public static void q22() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a month:(1~12)");
        int mon = in.nextInt();

        if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
            System.out.printf("%d month has 31 days.%n", mon);

        } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
            System.out.printf("%d month has 30 days.%n", mon);
        } else if (mon == 2) {
            System.out.printf("%d month has 28 days.%n", mon);
        } else {
            System.out.println("invalid input");
        }
        in.close();
    }

    public static void q23() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a integer:");
        int inte = in.nextInt();

        if (inte > 0) {
            System.out.println("positive integer");
        } else if (inte == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative integer");
        }
        in.close();
    }

    public static void q24() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your height:(m)");
        double hei = in.nextDouble();
        System.out.println("please enter your weight:(kg)");
        double wei = in.nextDouble();

        double bmi = wei / Math.pow(hei, 2);
        System.out.printf("your BMI is %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("underweight.");
        } else if (bmi < 24) {
            System.out.println("normal weight.");
        } else if (bmi < 27) {
            System.out.println("overweight.");
        } else {
            System.out.println("obesity.");
        }
        in.close();
    }

    public static void q25() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a month:(1~12)");
        int mon = in.nextInt();

        if (mon == 12 || mon == 1 || mon == 2) {
            System.out.println("Winter");
        } else if (mon >= 3 && mon <= 5) {
            System.out.println("Spring");
        } else if (mon >= 6 && mon <= 8) {
            System.out.println("Summer");
        } else if (mon >= 9 && mon <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Input error");
        }
        in.close();

    }

    public static void q26() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a month:(1~12)");
        int mon = in.nextInt();

        switch (mon) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.printf("%d month has 31 days.%n", mon);
                break;
            case 4, 6, 9, 11:
                System.out.printf("%d month has 30 days.%n", mon);
                break;
            case 2:
                System.out.printf("%d month has 28 days.%n", mon);
                break;
            default:
                System.out.println("invalid month");
        }
        in.close();

    }

    public static void q27() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a number:(1~7)");
        int week = in.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid import");
        }
        in.close();
    }

    public static void q28() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter operators:");
        char ope = in.next().charAt(0);
        System.out.println("please enter first integer:");
        int num1 = in.nextInt();
        System.out.println("please enter second integer:");
        int num2 = in.nextInt();

        switch (ope) {
            case '+':
                System.out.printf("a+b=%d%n", num1 + num2);
                break;
            case '-':
                System.out.printf("a-b=%d%n", num1 - num2);
                break;
            case '*':
                System.out.printf("a*b=%d%n", num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("a/b=%f%n", (double) num1 / num2);
                } else {
                    System.out.println("error:division by zero");
                }
                break;
            default:
                System.out.println("unsupported calculate");
        }
        in.close();
    }

    public static void q29() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your grade:");
        char gra = in.next().charAt(0);

        switch (gra) {
            case 'A':
                System.out.println("your score is 90~100 .");
                break;
            case 'B':
                System.out.println("your score is 80~89 score.");
                break;
            case 'C':
                System.out.println("your score is 70~79 score.");
                break;
            case 'D':
                System.out.println("your score is 60~69 score.");
                break;
            case 'F':
                System.out.println("your score is 0~59 score.");
                break;
            default:
                System.out.println("invalid grade.");
        }
        in.close();
    }

    public static void q30() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your transportation:");
        String tra = in.nextLine();

        switch (tra) {
            case "bicycle":
                System.out.println("30km/hr");
                break;
            case "car":
                System.out.println("200km/hr");
                break;
            case "train":
                System.out.println("300km/hr");
                break;
            case "airplane":
                System.out.println("900km/hr");
                break;
            default:
                System.out.println("invalid input.");
        }
        in.close();
    }

    public static void main(String[] args) {
        q30();
    }
}

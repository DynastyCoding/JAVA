package Java.others;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionProcession {
    public static void p1() {

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter First number:");
            int a = in.nextInt();
            System.out.println("Please enter Second number:");
            int b = in.nextInt();

            System.out.printf("two numbers division is: %d.%n", a / b);

        } catch (ArithmeticException e) {
            System.out.println("divisor can't be zero");
        } catch (InputMismatchException e) {
            System.out.println("need input numbers");
        }
    }

    public static void p2() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter First number:");
            int a = in.nextInt();
            System.out.println("Please enter Second number:");
            int b = in.nextInt();

            System.out.printf("two numbers division is: %d.%n", a / b);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void pwdCheck(String pwdStr) throws StringIndexOutOfBoundsException {

        if (pwdStr.length() >= 5 && pwdStr.length() <= 8) {
            System.out.println("Verification successful:" + pwdStr);
        } else {
            System.out.println("Verification fail" + pwdStr);
            throw new StringIndexOutOfBoundsException("Password length " +
                    "does not meet the requirements");
        }
    }

    public static void main(String[] args) {
        String[] passwords = {"abc", "hello", "eqrsfwgs"};

        for (String pwd : passwords) {
            try {
                pwdCheck(pwd);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("catch exception" + e.getMessage());
            }
        }
    }
}

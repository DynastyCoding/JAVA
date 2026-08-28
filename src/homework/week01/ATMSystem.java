package homework.week01;

import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your account balance:");
        int currentBalance = scanner.nextInt();
        System.out.println("enter your withdrawal amount:");
        int withdrawalAmount = scanner.nextInt();

        if (withdrawalAmount < 0) {
            System.out.println("incorrect withdrawal amount.");
        } else if (withdrawalAmount > currentBalance) {
            System.out.println("insufficient balance.");
        } else if (withdrawalAmount % 100 == 0) {
            System.out.println("withdrawal successful.");
        } else {
            System.out.println("withdrawal amount must be a multiple of 100.");
        }
        scanner.close();

    }
}

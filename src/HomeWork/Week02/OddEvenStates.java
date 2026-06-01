package HomeWork.Week02;

import java.util.Scanner;

public class OddEvenStates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a positive integer:");

        int count = in.nextInt();
        int oddSum = 0;
        int evenSum = 0;
        int evenCount = 0;

        for (int i = 1; i <= count; i++) {
            System.out.printf("enter number %d: ", i);
            int num = in.nextInt();

            if (num % 2 == 1) {
                oddSum = oddSum + num;
            } else {
                evenSum = evenSum + num;
                evenCount = evenCount + 1;
            }
        }
        System.out.printf("all odd summation = %d%n", oddSum);
        if (evenCount > 0) {
            System.out.printf("all even average = %.2f%n", (double) evenSum / evenCount);
        } else {
            System.out.println("even average output=0.0");
        }
        in.close();
    }
}

package practice.syntax;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = (int) (Math.random() * 100 + 1);
        System.out.println("=== Game start ===");
        int high = 100;
        int low = 1;
        System.out.printf("Please enter your guess number " + "between %d and %d. : %n", low, high);
        while (true) {
            int guess = in.nextInt();

            //Boundary handling
            if (guess > high || guess < low) {
                System.out.printf("Invalid input, please " + "enter between %d to %d.%n", low, high);
                continue;
            }

            if (guess > ans) {
                high = guess - 1;
                System.out.printf("Too big, " + "continue guess between %d and %d : %n", low, high);
            } else if (guess < ans) {
                low = guess + 1;
                System.out.printf("Too small, " + "continue guess between %d and %d : %n", low, high);
            } else {
                System.out.println("Guess right, congratulation");
                break;
            }
        }
    }
}

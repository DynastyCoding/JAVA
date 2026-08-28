package homework.week01;
import java.util.Scanner;
public class InputOutputExercise {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name:");
        String userName = scanner.nextLine();

        System.out.println("please enter your ages:");
        int userAge = scanner.nextInt();

        scanner.nextLine();

        System.out.println("please enter a sentence:");
        String userMessage = scanner.nextLine();

        System.out.printf("Your name：%s%n", userName);
        System.out.printf("Your ages：%d%n", userAge);
        System.out.printf("Your sentence：%s%n", userMessage);

    }

}

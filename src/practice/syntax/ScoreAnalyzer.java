package practice.syntax;

import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {

        int[] scores = new int[5];
        String[] subjects = {"國文", "英文", "數學", "自然", "社會"};
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("請輸入%s成績：", subjects[i]);
            scores[i] = in.nextInt();
        }

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    String temp2 = subjects[j];
                    subjects[j] = subjects[j + 1];
                    subjects[j + 1] = temp2;
                }
            }
        }

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Your %s scores = %d.%n"
                    , subjects[i], scores[i]);
            total += scores[i];
        }
        System.out.printf("Your average score is %d.%n"
                , total / scores.length);
        System.out.printf("Your max score is %d,subject is %s.%n" +
                        "Your min score is %d,subject is %s."
                , scores[0], subjects[0], scores[scores.length - 1], subjects[subjects.length - 1]);
        in.close();
    }
}
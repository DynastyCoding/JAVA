package practice.Level2;

import java.util.Scanner;

public class OddTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number :(1-9)");
        int n = in.nextInt();
        for (int i = 1; i < 10; i++) {

            //範圍判斷在前、條件篩選在後
            if (n * i > 30) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.printf("%d x %d = %d %n", n, i, n * i);
        }
    }
}

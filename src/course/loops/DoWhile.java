package course.loops;

import java.util.Scanner;

public class DoWhile {

    public static void p1() {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i >0);
    }

    static Scanner in = new Scanner(System.in);

    public static void p2() {

        int type;
        do {
            System.out.println("1.add meal.");
            System.out.println("2.cancel meal.");
            System.out.println("3.finish ordering.");
            System.out.println("type your choose:");
            type = in.nextInt();
        } while (type < 1 || type > 3);
    }

    public static void p3() {

        String type;
        do {
            System.out.println("start game and end game.");
            System.out.println("want to play again?(Y/N)");
            type = in.nextLine();
        } while (type.equals("Y"));
    }

    public static void main(String[] args) {
        p3();
    }
}

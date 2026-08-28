package course.loops;

public class NestedLoop {

    public static void p1() {

        int count = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.printf("1~50 has %d even.", count);
    }

    /*public static void p2() {

        int i = 1;
        while (true) {
            System.out.println(i);
            i++;
        }

    }
    */

    public static void p4() {

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void p5() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p9() {

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= 3 - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int k = 1; k <= 3-i; k++) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        p9();
    }
}

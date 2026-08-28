package course.conditionals;

public class Sequential {

    public static void sequentialStructure01() {
        int principle = 10000;
        double interestRate = 0.025;
        double interestAfterYear = principle * interestRate;
        double costAndBenefit = principle * (1 + interestRate);

        System.out.printf("Principle:%d%n", principle);
        System.out.printf("Interest rate:%f%n", interestRate);
        System.out.printf("Interest after one year:%s%n", interestAfterYear);
        System.out.printf("Cost and Benefit:%s%n", costAndBenefit);
    }

    public static void sequentialStructure02() {

        int c = 25;
        double f = c * 9.0 / 5 + 32;

        System.out.printf("攝氏溫度為%d%n華氏溫度為%f%n", c, f);
    }

    public static void sequentialStructure03() {

        int applep = 30;
        int bananap = 20;
        int orangep = 25;

        int appleq = 5;
        int bananaq = 3;
        int orangeq = 4;

        System.out.printf("Apple price %d,buy %d amount,Total %d dollar%n", applep, appleq, applep * appleq);
        System.out.printf("Banana price %d,buy %d amount,Total %d dollar%n", bananap, bananaq, bananap * bananaq);
        System.out.printf("Orange price %d,buy %d amount,Total %d dollar%n", orangep, orangeq, orangep * orangeq);
        System.out.printf("Total price=%d", applep * appleq + bananap * bananaq + orangep * orangeq);
    }

    public static void sequentialStructure04() {

        int ori = 3725;
        int h = ori / 3600;
        int m = (ori % 3600) / 60;
        int s = (ori % 3600) % 60;

        System.out.printf("%d hr %d min %d s", h, m, s);
    }

    public static void main(String[] args) {
        sequentialStructure01();
        sequentialStructure02();
        sequentialStructure03();
        sequentialStructure04();
    }
}

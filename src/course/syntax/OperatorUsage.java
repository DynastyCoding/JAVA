package course.syntax;

public class OperatorUsage {
    public static void demonstrateArithmeticOperators() {

        int a = 10;
        int b = 7;

        System.out.println(" a + b = " + (a + b));

    }

    public static void demonstrateMethodCalls() {

        int result1 = add(10, 20);
        int result2 = subtract(100, 35);
        int result3 = multiply(5, 6);

        System.out.println(" 10 + 20 = " + result1);
        System.out.println(" 100 - 35 = " + result2);
        System.out.println(" 5 = 6 " + result3);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void demonstrateAssignmentOperators() {

        int score = 60;
        score += 15;
        score -= 5;

        System.out.println(score);

        int money = 1000;
        money += 500;
        System.out.println(money);
        money -= 200;
        System.out.println(money);
    }

    public static void demonstrateIncrementDecrement() {

        int ticketNumber = 0;

        System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
        System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
        System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
        System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
        System.out.printf("第%d位客人，您抽到的是%d號%n", ++ticketNumber, ticketNumber);
        System.out.printf("今日已發出%d張號碼牌%n%n", ticketNumber);

        int hp = 10;
        System.out.printf("受到攻擊！剩餘生命%d%n", --hp);
        System.out.printf("受到攻擊！剩餘生命%d%n", --hp);
        System.out.printf("受到攻擊！剩餘生命%d%n%n", --hp);
        System.out.printf("戰鬥結束！剩餘生命%d%n%n", hp);

        int countDown = 5;
        System.out.printf("倒數 %d%n", countDown--);
        System.out.printf("倒數 %d%n", countDown--);
        System.out.printf("倒數 %d%n", countDown--);
        System.out.printf("倒數 %d%n", countDown--);
        System.out.printf("倒數 %d%n", countDown);
        System.out.println("0,火箭發射！");
    }

    public static void main(String[] args) {
        demonstrateArithmeticOperators();
        demonstrateMethodCalls();
        demonstrateAssignmentOperators();
        demonstrateIncrementDecrement();
    }
}

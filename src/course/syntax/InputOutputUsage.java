package course.syntax;

import java.util.Scanner;

public class InputOutputUsage {
    public static void helloWorld() {

        System.out.println("Hello World");
    }

    static Scanner in = new Scanner(System.in);

    public static void printInOut() {

        System.out.println("我正在學Java輸出與輸入");
        System.out.println("輸出不算難");
        System.out.println("只需注意差異性\n\n");

        System.out.print("Java");
        System.out.println("好好玩！\n\n");

        String name = "小明";
        int age = 18;
        System.out.printf("姓名:%s,", name);
        System.out.printf("年齡:%d歲\n\n", age);

        System.out.println("請輸入姓名：");
        String who = in.nextLine();
        System.out.printf("你好，%s", who);
        in.close();
    }

    public static void systemIn() {

        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double result = (a + b + c) / 3;
        System.out.println(result);
        in.close();
    }

    public static void systemIn2() {

        int a = in.nextInt();

        String result = (a >= 18) ? "已滿18" : "未滿18";
        System.out.println(result);
        in.close();
    }

    public static void systemIn3() {

        System.out.println("請輸入年齡：");
        int a = in.nextInt();
        in.nextLine();
        System.out.println("是否初次報名：(是/否)");
        String b = in.nextLine();

        String result = (a >= 15 && a <= 29 && b.equals("是")) ? "報名成功" : "不符合資格，報名失敗";
        System.out.println(result);
        in.close();
    }

    public static void main(String[] args) {
        helloWorld();
        printInOut();
        systemIn();
        systemIn2();
        systemIn3();
    }

}
package practice;

import java.util.Scanner;

public class Week02_Array_Enhance {

    static Scanner in = new Scanner(System.in);

    public static void p01() {

        int[] arr = new int[5];
        arr[0] = 60;
        arr[1] = 75;
        arr[2] = 88;
        arr[3] = 92;
        arr[4] = 45;

        System.out.printf("The third student's grades is: %d", arr[2]);
    }

    public static void p02() {

        int[] arr = {60, 75, 88, 92, 45};

        arr[3] = 100;
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void p03() {

        System.out.println("Please enter a integer:");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Input the %dth student's score:%n", i + 1);
            arr[i] = in.nextInt();
        }
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void p04() {

        int[] arr = {3, 8, 1, 9, 4};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.printf("Max is %d, index is %d.", max, maxIndex);
    }

    public static void p05() {

        int[] arr = {5, 12, 7, 8, 3, 10};
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            } else {
                oddSum += arr[i];
            }
        }
        System.out.printf("odd's sum is %d.%n", oddSum);
    }

    public static void p06() {

        String[] arr = {"A", "B", "C", "D"};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void p07() {

        int[] ori = {2, 4, 6, 8};
        int[] copy = new int[4];

        for (int i = 0; i < ori.length; i++) {
            copy[i] = ori[i] * 2;
            System.out.println(copy[i]);
        }
    }

    public static void p08() {
        int[] arr = {10, 20, 30, 40};
        int temp = arr[arr.length - 1];
        int i;
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void p09() {

        String[] arr = {"apple", "banana", "grape", "orange"};
        System.out.println("Please enter a type of fruit:");
        String inp = in.nextLine();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(inp)) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    public static void p10() {

        int[] arr = {5, 2, 9, 2, 7, 2, 4};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                arr[i] = 0;
                count++;
            }
        }
        System.out.printf("2 appeared %d times.%n", count);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void ex1() {
        int[] arr = {10, 20, 30, 40, 50};
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void ex2() {

        int[] arr = {7, 3, 9, 2, 8};
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.printf("Min is %d, index is %d", min, index);
    }
    public static void ex3(){
        String[] arr = {"cat", "dog", "bird", "fish"};
        System.out.println("Please enter one kind of animal name:");
        String inp = in.nextLine();
        int i=-1;
        for (i = 0; i < arr.length; i++) {
            if(arr[i].equals(inp)){
                break;
            }
        }
        if(i!=arr.length){
            System.out.printf("Found at index %d",i);
        }else{
            System.out.println("No found");
        }
    }

    public static void ex4(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]>5){
                System.out.println(arr[i]);break;
            }
        }
        if(i==arr.length){
            System.out.println("None");
        }
    }


    public static void main(String[] args) {
        ex3();
    }
}

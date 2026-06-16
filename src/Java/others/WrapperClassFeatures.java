package Java.others;

import java.util.Scanner;

public class WrapperClassFeatures {

    static Scanner in = new Scanner(System.in);

    public static void PackageClass() {

        int level = 5;
        boolean isOnline = true;

        Integer levelObj = level;
        Boolean isOnlineObj = isOnline;

        System.out.println("level = " + level + " type:int");
        System.out.println("isOnline = " + isOnline + " type:boolean");

        System.out.println("levelObj = " + levelObj + "，type：" + levelObj.getClass().getSimpleName());
        System.out.println("isOnlineObj = " + isOnlineObj + "，type：" + isOnlineObj.getClass().getSimpleName());
    }

    public static void SafeHp() {
        Integer maxHp = 100;
        Integer currentDamage = null;

        int remainHp = (currentDamage == null) ? maxHp : maxHp - currentDamage;
        System.out.println("Remaining HP: " + remainHp);

        {   //-128~127可以判斷
            Integer x = 100, y = 100;
            System.out.println(x == y);
        }

        {
            Integer x = 200, y = 200;
            System.out.println(x == y);
        }
    }

    public static void IntPractice() {

        System.out.println("Please enter first integer: ");
        String s1 = in.nextLine();
        System.out.println("Please enter second integer: ");
        String s2 = in.nextLine();

        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("Add = " + Integer.sum(n1, n2));
        System.out.println("Subtraction = " + Integer.sum(n1, -n2));
        System.out.println("Multiple = " + (n1 * n2));
        System.out.println(Integer.max(n1, n2) + " is relatively large");
    }


    public static void main(String[] args) {
        IntPractice();
    }
}

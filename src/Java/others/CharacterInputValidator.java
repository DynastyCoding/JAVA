package Java.others;

import java.util.Scanner;

public class CharacterInputValidator {

    static Scanner in = new Scanner(System.in);

    static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter the character name: ");
        String name = in.nextLine();
        System.out.println("Please enter HP: ");
        String strHp = in.nextLine();
        in.close();

        int hp = isInteger(strHp) ? Integer.parseInt(strHp) : 0;
        int finalHp = Integer.min(hp, 9999);

        System.out.printf("character: %s%n" +
                "hp: %d", name, finalHp);
    }
}

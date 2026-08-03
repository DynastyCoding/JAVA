package practice.OOP.Encapsulation;

public class MemberMain {
    public static void main(String[] args) {
        Member m1 = new Member("M001", "張三", 1, 0);
        m1.printInfo();

        System.out.println();

        Member m2 = new Member("M002", "", 10, 0);
        m2.printInfo();

        System.out.println();
        System.out.println("=== 增加點數 ===");

        m1.addPoints(80);
        m1.addPoints(80);

        System.out.println();
        System.out.println("=== 使用點數 ===");

        m1.usePoints(50);
        m1.usePoints(200);

        System.out.println();
        System.out.println("=== 最終狀態 ===");
        m1.printInfo();
    }
}

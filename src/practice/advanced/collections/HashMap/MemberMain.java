package practice.advanced.collections.HashMap;

public class MemberMain {
    public static void main(String[] args) {

        MemberSpending ms = new MemberSpending();

        ms.addSpending("M001", 1500);
        ms.addSpending("M002", 2400);
        ms.addSpending("M001", 2000);
        ms.addSpending("M003", 800);

        ms.printAll();

        System.out.println("M001 spending: $" + ms.getSpending("M001"));  // 3500
        System.out.println("M999 spending: $" + ms.getSpending("M999"));  // -1

        System.out.println("Total members: " + ms.getTotalMembers());     // 3

        System.out.println("Remove M002: " + ms.removeMember("M002"));    // true
        System.out.println("Remove M999: " + ms.removeMember("M999"));    // false

        System.out.println("Total members: " + ms.getTotalMembers());     // 2

        ms.printAll();

    }
}

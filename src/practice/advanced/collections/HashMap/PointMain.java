package practice.advanced.collections.HashMap;

public class PointMain {
    public static void main(String[] args) {
        PointSystem ps = new PointSystem();

        ps.addOrUpdatePoints("M001", 100);
        ps.addOrUpdatePoints("M002", 50);
        ps.addOrUpdatePoints("M001", 30);

        ps.printAll();
        // M001 -> 130
        // M002 -> 50

        System.out.println("M001 points: " + ps.getPoint("M001"));  // 130
        System.out.println("M999 points: " + ps.getPoint("M999"));  // -1

        ps.pointDiscount("M001", 50);
        ps.pointDiscount("M001", 100);
        ps.pointDiscount("M999", 10);

        System.out.println("M001 points: " + ps.getPoint("M001"));  // 80

        System.out.println("Total members: " + ps.getMemberNumbers());  // 2

        ps.deleteMember("M002");
        ps.deleteMember("M999");

        ps.printAll();
        // M001 -> 80
    }
}
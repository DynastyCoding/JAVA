package practice.stream_string;

public class StringPractice2 {
    public static void main(String[] args) {
        String fullName = " Duke Levi ";
        String normalizedName = fullName
                .trim()
                .toUpperCase();
        System.out.println(normalizedName);

        String status = "Shipped";
        boolean isShipped = status.equalsIgnoreCase("shipped");
        System.out.println(isShipped);

        String description = "This is a very long product description text";
        String subDescription = description.substring(0,20);
        System.out.println(subDescription);

        String address = " 高雄市 前鎮區";
        String cleanedAddress = address
                .replace(" ","");
        System.out.println(cleanedAddress);

        String email = "duke.levi@gmail.com";
        String localPart = email
                .split("@")[0];
        System.out.println(localPart);

        String phone = "0912-345-678";
        boolean is09Start = phone
                .startsWith("09");
        System.out.println(is09Start);

        String id = "A123456789";
        boolean isId = id.length() == 10
                && Character.isUpperCase(id.charAt(0));
        System.out.println(isId);

        String cart = "laptop,mouse,keyboard,monitor";
        int cartItemAmounts = cart.split(",").length;
        System.out.println(cartItemAmounts);

        String password = "Duke1234";
        boolean isStrong = password.length() == 8 && !password.equals(password.toLowerCase());
        System.out.println(isStrong);

        String filename = "resume_final_v2.pdf";
        boolean isPdf = filename.endsWith(".pdf");
        String mainFileName = filename.split("\\.")[0];
        System.out.println(isPdf);
        System.out.println(mainFileName);
    }
}

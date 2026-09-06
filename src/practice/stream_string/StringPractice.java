package practice.stream_string;

public class StringPractice {
    public static void main(String[] args) {

        String account = " Duke123 ";
        String normalizedAccount = account
                .trim()
                .toLowerCase();
        System.out.println(normalizedAccount);

        String email = "duke@test.com";
        boolean isValidEmail = email
                .contains("@") && email.endsWith(".com");
        System.out.println(isValidEmail);

        String phone = "0912-3345-678";
        String cleanedPhone = phone
                .replace("-", "");
        System.out.println(cleanedPhone);

        String productName = "Apple iPhone 15 Pro";
        boolean isIphoneFound = productName
                .contains("iPhone");
        System.out.println(isIphoneFound);

        String id = "A123456789";
        char firstId = id
                .charAt(0);
        System.out.println(firstId);

        String orderCode = "ORD-2024-001";
        String lastCode = orderCode.substring(orderCode.length()-3);
        System.out.println(lastCode);

        String address = "Taipei City";
        boolean isCity = address.endsWith("City");
        System.out.println(isCity);

        String comment = " Excellent service ";
        int length = comment
                .trim()
                .length();
        System.out.println(length);

        String price = "1,299";
        int cleanedPrice = Integer.parseInt(price.replace(",", ""));
        System.out.println(cleanedPrice);

        String taxId = "12345678";
        boolean isLengthEight = taxId.length() == 8;
        System.out.println(isLengthEight);
    }
}

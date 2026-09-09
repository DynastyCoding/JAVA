package practice.String;

public class Practice3 {
    public static void main(String[] args) {

        String account = "  LEVI_2024  ";
        String normalizedAccount = account
                .trim()
                .toLowerCase();
        System.out.println(normalizedAccount);

        String email = "duke@gmail.com";
        boolean isValidEmail = email.contains("@") && email.endsWith(".com");
        System.out.println(isValidEmail);

        String orderId = "ORD-2024-0001";
        String lastFourDigits = orderId.split("-")[2];
        System.out.println(lastFourDigits);

        String productName = "MacBook Pro 14";
        boolean isMacbook = productName.contains("MacBook");
        System.out.println(isMacbook);

        String phone = "(02) 1234-5678";
        String cleanedPhone = phone
                .replace("(","")
                .replace(")","")
                .replace("-","")
                .replace(" ","");
        System.out.println(cleanedPhone);

        String address = "台北市信義區";
        boolean isDistrict = address.endsWith("區");
        System.out.println(isDistrict);

        String fullName = "Duke Levi";
        String[] names = fullName.split(" ");
        System.out.println("First name: " + names[0]);
        System.out.println("Last name: " + names[1]);

        String password = "duke1234";
        boolean hasDigit = password.matches(".*\\d.*");
        System.out.println(hasDigit);

        String fileName = "report_final.pdf";
        boolean isPDF = fileName.endsWith(".pdf");
        System.out.println(isPDF);

        String data = "   ";
        boolean isDataBlank = data.isBlank();
        System.out.println(isDataBlank);
    }
}

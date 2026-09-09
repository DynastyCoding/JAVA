package practice.regex;

public class Practice {
    public static void main(String[] args) {

        String phone = "0912345678";
        boolean isValidPhone = phone.matches("09\\d{8}");
        System.out.println(isValidPhone);

        String email = "duke@gmail.com";
        boolean isValidEmail = email.matches(".+@.+\\..+");
        System.out.println(isValidEmail);

        String id = "A123456789";
        boolean isValidId = id.matches("[A-Z]\\d{9}");
        System.out.println(isValidId);

        String date = "2024-01-15";
        boolean isValidDate = date.matches("\\d{4}-\\d{2}-\\d{2}");
        System.out.println(isValidDate);

        String orderId = "ORD-2024-0001";
        boolean isValidOrder = orderId.matches("ORD-\\d{4}-\\d{4}");
        System.out.println(isValidOrder);

        System.out.println();

        String homePhone = "02-12345678";
        boolean isHomePhone = homePhone.matches("\\d{2,3}-\\d{7,8}");
        System.out.println(isHomePhone);

        String taxId = "12345678";
        boolean isTaxId = taxId.matches("\\d{8}");
        System.out.println(isTaxId);

        String account = "duke_2024";
        boolean isAccount = account.matches("\\w{6,12}");
        System.out.println(isAccount);

        String creditCard = "1234-5678-9012-3456";
        boolean isCreditCard = creditCard.matches("\\d{4}(-\\d{4}){3}");
        System.out.println(isCreditCard);

        String password = "Duke1234";
        boolean isValidPassword =
                password.matches("\\w{8,12}")
                && password.matches(".*[A-Z].*")
                && password.matches(".*[0-9].*");
        System.out.println(isValidPassword);

    }
}

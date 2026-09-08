package practice.regex;

public class practice3 {
    public static void main(String[] args) {
        String taxId = "12345678";
        boolean isTaxId = taxId.matches("[1-9]\\d{7}");
        System.out.println(isTaxId);

        String password = "Chovy@2024";
        /*
        boolean isStrong =
                password.matches(".{8,20}")
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

         */
        boolean isStrong =
                password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)" +
                        "(?=.*[!@#$%^&*(),.?\":{}|<>]).{8,20}$");
        System.out.println(isStrong);

        String email = "chovy.levi+2024@gmail.com.tw";
        boolean isEmail = email.matches("[\\w.%+-]*@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        System.out.println(isEmail);

        String invoice = "AB-12345678";
        boolean isInvoice = invoice.matches("[A-Z]{2}-\\d{8}");
        System.out.println(isInvoice);

        String email2 = "duke.levi@gmail.com";
        boolean isEmail2 = email2.matches("[A-Za-z0-9.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        System.out.println(isEmail2);

        System.out.println();

        String phone = "+886-912-345-678";
        boolean isPhone = phone.matches("\\+\\d{1,3}(-\\d{3}){3}");
        System.out.println(isPhone);

        String url = "https://www.example.com/path/page";
        boolean isUrl = url.matches("^https://.*");
        System.out.println(isUrl);

        //密碼強度：判斷長度、大寫、小寫、數字、特殊符號
        String password2 = "Duke@2024";

        boolean isPassword2 = password2.matches(".{8,20}")
                && password2.matches(".*[A-Z].*")
                && password2.matches(".*[a-z].*")
                && password2.matches(".*[0-9].*")
                && password2.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
        System.out.println(isPassword2);

        String orderId = "ORD-2024-0001";
        boolean isId = orderId.matches("ORD(-\\d{4}){2}");
        System.out.println(isId);

        String barcode = "/ABC1234";
        boolean isBarcode = barcode.matches("/[A-Z0-9]{7}");
        System.out.println(isBarcode);

    }
}

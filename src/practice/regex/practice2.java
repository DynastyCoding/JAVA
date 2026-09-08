package practice.regex;

public class practice2 {
    public static void main(String[] args) {
        String memberId = "M001";
        boolean isId = memberId.matches("[A-Z]\\d{3}");
        System.out.println(isId);

        String barcode = "4711234567890";
        boolean isBarcode = barcode.matches("\\d{13}");
        System.out.println(isBarcode);

        String licensePlate = "ABC-1234";
        boolean isLicensePlate = licensePlate.matches("[A-Z]{3}-\\d{4}");
        System.out.println(isLicensePlate);

        String hexColor = "#FFA500";
        boolean isHexColor = hexColor.matches("#[A-Z0-9]{6}");
        System.out.println(isHexColor);

        String dateTime = "2024-01-15 14:30";
        boolean isValidDateTime = dateTime.matches("\\d{4}(-\\d{2}){2} \\d{2}:\\d{2}");
        System.out.println(isValidDateTime);

        System.out.println();

        String studentId = "S11306001";
        boolean isStudentId = studentId.matches("[A-Z]\\d{8}");
        System.out.println(isStudentId);

        String internationalPhone = "+886-912345678";
        boolean isInternationalPhone = internationalPhone.matches("\\+[0-9]{1,3}-[0-9]{8,10}");
        System.out.println(isInternationalPhone);

        String isbn = "978-957-123-456-7";
        boolean isIsbn = isbn.matches("978(-[0-9]{3}){3}-[0-9]");
        System.out.println(isIsbn);

        String time = "09:30";
        boolean isValidTime = time.matches("\\d{2}:\\d{2}");
        System.out.println(isValidTime);

        String social = "@duke_levi";
        boolean isValidSocial = social.matches("@\\w{4,15}");
        System.out.println(isValidSocial);

    }
}

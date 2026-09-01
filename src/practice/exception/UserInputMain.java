package practice.exception;

public class UserInputMain {
    public static void main(String[] args) {
        UserInputValidator validator = new UserInputValidator();

        // 1. 字串轉數字
        System.out.println("parseAge(\"25\") = " + validator.parseAge("25"));
        System.out.println("parseAge(\"abc\") = " + validator.parseAge("abc"));

        // 2. 取第一個字元
        System.out.println("getFirstChar(\"Hello\") = " + validator.getFirstChar("Hello"));
        System.out.println("getFirstChar(null) = " + validator.getFirstChar(null));

        // 3. 取陣列元素
        int[] arr = {10, 20, 30};
        System.out.println("getElement(arr, 1) = " + validator.getElement(arr, 1));
        System.out.println("getElement(arr, 5) = " + validator.getElement(arr, 5));

        // 4. 除法
        System.out.println("divide(10, 2) = " + validator.divide(10, 2));
        System.out.println("divide(10, 0) = " + validator.divide(10, 0));

        // 5. 型別轉換
        System.out.println("castToInteger(100) = " + validator.castToInteger(100));
        System.out.println("castToInteger(\"Hello\") = " + validator.castToInteger("Hello"));
    }
}
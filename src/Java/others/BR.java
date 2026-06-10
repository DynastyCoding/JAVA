package Java.others;

public enum  BR{

    SUCCESS(200, "borrow successful"),
    NOT_FOUND(404, "book couldn't be found"),
    NOT_AVAILABLE(409, "book had been borrowed");

    private int code;
    private String message;

    BR(int code, String message) {  // 建構子
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

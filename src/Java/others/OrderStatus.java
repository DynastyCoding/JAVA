package Java.others;

public enum OrderStatus {

    SUCCESS(200, "Order placed"),
    OUT_OF_STOCK(400, "Insufficient inventory"),
    INVALID_AMOUNT(401, "Incorrect order quantity");

    private final int code;
    private final String message;
    OrderStatus(int code, String message){
        this.code = code; this.message = message;
    }

    public int getCode(){return code;}
    public String getMessage(){return message;}



}

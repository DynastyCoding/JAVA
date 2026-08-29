package practice.exception;

public class OrderProcessor {

    //1.String to Numbers
    public void parseQuantity(String input){
        try{
            int quantity = Integer.parseInt(input);
            System.out.println("quantity: " + quantity);
        }catch(NumberFormatException e){
            System.out.println("Invalid quantity.");
        }
    }

    //2.Array Superboundary
    public void getOrderItem(){
        String[] items = {"A","B","C"};
        try{
            System.out.println("Order item: " + items[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid order index.");
        }
    }

    //3.null value
    public void getMemberName(){
        String memberName = null;
        try{
            System.out.println("Member name length: " + memberName.length());
        }catch(NullPointerException e){
            System.out.println("Member not found.");
        }
    }

    //4.divide by zero
    public void calculateAverage(){
        int totalAmount = 1000;
        int orderCount = 0;
        try{
            int average = totalAmount/orderCount;
            System.out.println("Average amount: " + average);
        }catch(ArithmeticException e){
            System.out.println("Order counts cannot be zero.");
        }
    }

    //5.throw
    public void checkAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        System.out.println("Age: " + age);
    }

}

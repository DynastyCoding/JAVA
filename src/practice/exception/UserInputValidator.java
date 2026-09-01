package practice.exception;

public class UserInputValidator {

    public int parseAge(String input){
        try{
            int output = Integer.parseInt(input);
            return output;
        }catch(NumberFormatException e){
            System.out.println("Invalid number format.");
            return -1;
        }
    }

    public char getFirstChar(String text){
        try{
            char fw = text.charAt(0);
            return fw;
        }catch(NullPointerException e){
            System.out.println("Null value encountered.");
            return '\0';
        }
    }

    public int getElement(int[] arr, int index){
        try{
            return arr[index];
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds.");
            return -1;
        }
    }

    public double divide(int a, int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("Division by zero.");
            return 0;
        }
    }

    public Integer castToInteger(Object obj){
       try{
           Integer num = (Integer)obj;
           return num;
       }catch(ClassCastException e){
           System.out.println("Invalid class cast.");
           return null;
       }
    }
}

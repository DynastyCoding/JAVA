package practice.exception;

public class CrashDemo {

    // 1.NullPointerException
    public void crashNull(){
        try{
            String name = null;
            System.out.println(name.length());
        }catch(NullPointerException e){
            System.out.println("Null value encountered.");
        }
    }

    // 2.IndexOutOfBoundException
    public void crashIndex(){
       try{
           int[] arr = {1,2,3,};
           System.out.println(arr[5]);
       }catch(IndexOutOfBoundsException e){
           System.out.println("Index out of bounds.");
       }
    }

    // 3.NumberFormatException
    public void crashNumber(){
        try{
            int x = Integer.parseInt("abc");
            System.out.println(x);
        }catch(NumberFormatException e ){
            System.out.println("Invalid number format.");
        }
    }

    // 4.ClassCastException
    public void crashCast(){
        try{
            Object obj = "Hello";
            Integer num = (Integer) obj;
            System.out.println(num);
        }catch(ClassCastException e){
            System.out.println("Invalid class cast.");
        }
    }

    // 5.ArithmeticException
    public void crashArithmetic(){
        try{
            int result = 10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("Division by zero.");
        }
    }

}

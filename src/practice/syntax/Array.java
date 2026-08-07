package practice.syntax;

public class Array {

    public static void p1(){
        String[] fruits = {"Apple", "Banana", "Orange"};

        for(String f:fruits){
            System.out.println(f);
        }

        for(int i=0; i<fruits.length; i++){
            System.out.println(i + ":" + fruits[i]);
        }
    }

    public static void p2(){
        int[] nums = {5, 10, 15, 20, 25};
        for(int n :nums){
            System.out.println(n);
        }
    }

    public static void p3(){
        int[] nums = {5,10,15,20,25};
        int sum = 0;
        for(int n: nums){
            sum += n;
        }
        System.out.println(sum);
    }

    public static void p4(){
        String[] names = {"Alice", "Bob", "Carolin"};

        for(String n: names){
            System.out.println("Hello, " + n);
        }
    }

    public static void p5(){
        int[] nums = {3,7,2,9,4,6};
        int max = 0;
        for(int n: nums){
            if(n>max){
                max = n;
            }
        }
        System.out.println(max);
    }

    public static void p6(){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int n: nums){
            if(n%2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void p7(){
        String[] fruits = {"apple","banana", "cherry"};

        String result = "";

        for(String f:fruits){
           result += f + ",";
        }

        result = result.substring(0,result.length()-1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        p7();
    }
}

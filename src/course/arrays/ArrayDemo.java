package course.arrays;

public class ArrayDemo {

    public static void sumAndAverage() {

        int[] arr = {25, 15, 98, 15, 52, 81};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("sum is: %d%n", sum);
        System.out.printf("average is: %d%n", sum / arr.length);
    }

    //for each
    public static void sumAndAverage2(){

        int[] arr = {25,15,98,15,52,81};
        int sum = 0;
        for (int num:arr){
            sum+=num;
        }
        System.out.printf("sum is %d%n",sum);
    }

    public static void maxAndMin() {

        int[] arr = {25, 15, 98, 15, 52, 81};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void arrayReversal() {

        int[] arr = {25, 15, 98, 15, 52, 81};

        for (int i = arr.length-1 ; i >=0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        //sumAndAverage1();
        //sumAndAverage2();
        //maxAndMin();
        arrayReversal();
    }
}

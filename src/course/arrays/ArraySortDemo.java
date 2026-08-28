package course.arrays;
import java.util.Arrays;
import java.util.Collections;
public class ArraySortDemo {

    public static void bubbleSort() {

        int[] arr = {25, 15, 98, 15, 52, 81};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        /*for (int num : arr) {
            System.out.println(num);}*/
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void arraySort() {

        int[] arr = {25, 15, 98, 15, 52, 81};
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void collectionsReverseOrder(){

        Integer[] arr = {25, 15, 98, 15, 52, 81};
        Arrays.sort(arr,Collections.reverseOrder());

        for(Integer ar:arr){
            System.out.println(ar);
        }

    }

    public static void main(String[] args) {
        //bubbleSort();
        //arraySort();
        collectionsReverseOrder();
    }
}

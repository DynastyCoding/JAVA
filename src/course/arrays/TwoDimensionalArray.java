package course.arrays;

public class TwoDimensionalArray {

    public static void p1() {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9,}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }

    public static void p2() {

        int[][] arr = {{3, 7, 2}, {9, 1, 5}, {4, 8, 6}, {2, 10, 3}};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("maximum value is = %d", max);
    }

    public static void p3() {

        int[][] scores = {{85, 90, 78, 92}, {88, 76, 95, 82}, {92, 88, 85, 90}};

        for (int i = 0; i < scores.length; i++) {
            int sum =0;
            int ave ;
            for (int j = 0;j<scores[i].length;j++ ){
                sum+= scores[i][j];
            }
            ave = sum/scores[i].length;
            System.out.printf("第%d班的平均成績為： %d分%n",i+1,ave);
        }
    }

    public static void main(String[] args) {
        //p1();
        //p2();
        p3();
    }
}

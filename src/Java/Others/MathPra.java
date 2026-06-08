package Java.Others;

public class MathPra {
    public static void main(String[] args) {

        System.out.println(java.lang.Math.abs(-369));

        int[] arr = {10, 50, 90, 20, 30};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = java.lang.Math.max(max, arr[i]);
            min = java.lang.Math.min(min, arr[i]);
        }
        System.out.println("最大值:" + max + " 最小值:" + min);


        System.out.println("Welcome to Russian Roulette");
        int dice =(int)(java.lang.Math.random()*6)+1;

        if(dice==4){
            System.out.println("you die");
        }System.out.println("nothing happen");



        System.out.println(dice);

        int rand = (int)(java.lang.Math.random()*100)+1;
        System.out.println(rand);


    }
}

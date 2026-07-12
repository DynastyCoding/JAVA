package practice.Level2;

public class ControlFlow {

    public static void p01(){
        int num = 7;
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void p02(){
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void p03(){
        int score = 85;
        if(score>=60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }

    public static void p04(){
        String text = "Java";
        for (int i = text.length()-1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    public static void  p05(){
        int[] numbers = {3, 8, 12, 5, 20};
        for (int i = 0; i < 5; i++) {
            if(numbers[i]%2==0){
                System.out.printf("%d, ", numbers[i]);
            }
        }
    }

    public static void p06(){
        String password = "hello123";
        if(password.length()>=8){
            System.out.println("Strong");
        }else{
            System.out.println("Weak");
        }
    }

    public static void p07(){
        int price = 150;
        if(price>100){
            System.out.println(price*0.8);
        }else{
            System.out.println(price);
        }
    }

    public static void p08(){
        int count =1;
        while(count<=3){
            System.out.println("Hello");
            count++;
        }
    }

    public static void p09(){
        int[] nums = {45, 12, 89, 33};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public static void p10(){
        System.out.println(add(10,5));
    }

    public static int add(int a, int b){
        return (a+b);
    }


    public static void p11(){

        String acc = "user123 ";
        if(acc.contains(" ")){
            System.out.println("Contains invalid characters.");
            return;
        }
        if(acc.length()<6){
            System.out.println("Insufficient length.");
        }else{
            System.out.println("Correct format.");
        }
    }

    public static void p12(){
        int amount = 2500;
        if(amount>2000){
            System.out.println(amount*0.8);
        }else if (amount<=2000&&amount>=1000){
            System.out.println(amount*0.9);
        }else{
            System.out.println((amount));
        }
    }

    //奇偶判定 無旗標版
    public static void p13(){
        int n = 66;
        for (int i = 2; i < n/2; i++) {
            if(n%i ==0){
                System.out.println("Isn't prime.");
                return;
            }
        }
        System.out.println("Is prime.");
    }

    //奇偶判定 有旗標版
    public static void p13_2(){
        int n = 66;
        boolean isPrime = true;

        for (int i = 2; i < n/2; i++) {// ⚠️ 只要檢查到一半就好
            if(n%i ==0){
                isPrime = false;
                break; // ⚠️ 既然已經確定不是質數了，直接 break 跳出迴圈，不用繼續算了！
            }
        }
        if(isPrime){ // ⚠️ 寫 if(isPrime) 就好，不用寫 == true
            System.out.println("Is prime.");
        }else{
            System.out.println("Isn't prime.");
        }
    }

    public static void p14(){
        String cardNum = "0000-1234-7766-8943";
        String last4 = cardNum.substring(cardNum.length()-4);
        String result = "****-****-****-" + last4;
        System.out.println(result);
    }

    public static void p15(){
        int[] orderIds = {101, 305, 402, 888, 512}; //⚠️orderId加s(複數訂單
        int target = 888;

        for (int i = 0; i < orderIds.length; i++) {
            if(target == orderIds[i]){
                System.out.printf("Order was found, ranked %d.",(i+1)); //⚠️i+1括號起來 增加可讀性
                return;
            }
        }
        System.out.println("No orders found.");
    }

    public static void p16(){

        int score = 85;
        if(score>=90){
            System.out.println("A");
        }else if(score>=80){
            System.out.println("B");
        }else if(score>=70){
            System.out.println("C");
        }else if(score>=60) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }

    public static void p17(){

        String slogan = "Spring Boot is powerful";

        for (int i = 0; i < slogan.length(); i++) {
            
        }
    }

    public static void main(String[] args) {
        p16();
    }

}

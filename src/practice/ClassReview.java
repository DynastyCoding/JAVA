package practice;

public class ClassReview {
    public static void main(String[] args) {
        ClassReview.talk("Hello");
        ClassReview.talk("你好");

        int ans = BasicMath.add(3, 4);
        System.out.println(ans);

        int ans2 = BasicMath.multiply(4, 2);
        System.out.println(ans2);
    }

    static void talk(String content) {
        System.out.println(content);
    }
}

class BasicMath {
    // 如果資料有後續多種用途，就存起來回傳，讓資料在外面做後續操作。
    static int add(int n1, int n2) {
        int result = n1 + n2;
        //得到的結果通常不一定需要馬上印出來，不預設結果要直接用
        //System.out.println(result);
        return result;
    }

    //如果只單純要結果，就單純回傳結果(可能後續還需要增加文字，保留最大彈性，不要寫死在方法)。
    static int multiply(int n1, int n2) {
        return n1 * n2;
    }
}
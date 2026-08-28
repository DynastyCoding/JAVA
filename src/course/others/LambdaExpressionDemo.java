package course.others;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionDemo {
    public static void lam1() {
        List<String> heros = List.of("king", "queen", "bishop", "rook", "knight", "pawn");

        String result = heros.stream()//轉成串流（可以一筆一筆處理）
                .filter(n -> n.length() >= 3)//只保留長度≥3的
                .sorted()//字母順序排序
                .collect(Collectors.joining("、"));//用「、」連接
        System.out.println(result);
    }

    /*
    沒有Lambda時
     1. 篩選長度 ≥ 3
    List<String> filtered = new ArrayList<>();
    for (String n : heros) {
        if (n.length() >= 3) {
            filtered.add(n);
        }
    }

    // 2. 排序
    Collections.sort(filtered);

    // 3. 連接
    String result = "";
    for (int i = 0; i < filtered.size(); i++) {
        result += filtered.get(i);
        if (i < filtered.size() - 1) {
            result += "、";
        }
    }
    */
    public static void lam2() {
        List<String> heros = List.of("king", "queen", "bishop", "rook", "knight", "pawn");
        heros.forEach(System.out::println);

        heros.stream().map(String::length);

        heros.stream()
                .map(String::hashCode)
                .map(Integer::valueOf)
                .forEach(System.out::println);
    }

    public static void lam3() {

        List<String> heros = List.of("炭治郎", "禰豆子", "善逸", "伊之助", "蜜璃", "甘露寺", "時透無一郎");
        String result = heros.stream()
                .filter(n -> n.length() >= 3)
                .sorted()
                .collect(Collectors.joining("、"));
        System.out.println(result);
    }

    public static void lam4() {

        List<Integer> scores = List.of(45, 78, 90, 62, 55, 85, 91, 73);
        List<Integer> passed = scores.stream()
                .filter(s -> s >= 60)
                .sorted(Comparator.reverseOrder())
                .toList();

        String joined = passed.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("、"));
        System.out.println(joined); // 91、90、85、78、73、62

        int total = passed.stream().reduce(0, Integer::sum);
        System.out.println("及格總分：" + total);
    }

    public static void main(String[] args) {
        lam4();
    }

}

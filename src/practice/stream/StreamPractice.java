package practice.stream;

import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> amounts = List.of(300, 800, 1200, 450, 900);
        List<Integer> result = amounts.stream()
                .filter(a -> a>500)
                .toList();

        System.out.println(result);

        List<String> memberIds = List.of("a123","b456","c789");
        List<String> upperIds = memberIds.stream()
                .map(id -> id.toUpperCase())
                .toList();
        System.out.println(upperIds);


        List<Integer> prices = List.of(100, 250, 400, 800);
        List<Double> discountPrices = prices.stream()
                .map(p -> p*0.8)
                .toList();
        System.out.println(discountPrices);

        List<String> comments = List.of("Good", "Excellent service", "Nice", "Very good product quality");
        List<String> overTenWords = comments.stream()
                .filter(w -> w.length()>10)
                .toList();
        System.out.println(overTenWords);

        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> newNumbers = numbers.stream()
                .filter(a -> a%2==1)
                .map(a -> a*3)
                .toList();
        System.out.println(newNumbers);
    }
}

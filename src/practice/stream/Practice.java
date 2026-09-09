package practice.stream;

import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<Integer> amounts = List.of(300, 800, 1200, 450, 900);
        List<Integer> result = amounts.stream()
                .filter(a -> a>500)
                .toList();

        System.out.println(result);

        List<String> memberIds = List.of("a123","b456","c789");
        List<String> upperIds = memberIds.stream()
                .map(String::toUpperCase)
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

        List<Integer> amounts2 = List.of(800, 1200, 1500, 600, 2000);
        List<Double> discountAmounts = amounts2.stream()
                .filter(a -> a>=1000)
                .map(a -> a*0.9)
                .toList();
        System.out.println(discountAmounts);

        List<String> names = List.of("Laptop", "", "MOUSE", "Keyboard", " ");
        List<String> normalizedNames = names.stream()
                .filter(a -> !a.isBlank())
                .map(String::toLowerCase)
                .toList();
        System.out.println(normalizedNames);

        List<String> ids = List.of("emp001", "EMP002", "abc003", "emp004");
        List<String> empIds = ids.stream()
                .map(String::toUpperCase)
                .filter(a -> a.contains("EMP"))
                .toList();
        System.out.println(empIds);

        List<Integer> quantities = List.of(3,8,5,12,20);
        List<Double> adjustQuantities = quantities.stream()
                .filter(a-> a>5)
                .map(a -> a*1.5)
                .toList();
        System.out.println(adjustQuantities);

        List<String> comments2 = List.of("  Good  ", "Bad", "  Excellent service  ", "Nice");
        List<String> cleanedComments = comments2.stream()
                .map(String::trim)
                .filter(a->a.length()>=5)
                .toList();
        System.out.println(cleanedComments);
    }
}

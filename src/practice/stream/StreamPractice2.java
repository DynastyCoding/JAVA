package practice.stream;

import java.util.List;

public class StreamPractice2 {
    public static void main(String[] args) {
        List<Integer> amounts = List.of(800, 1200, 1500, 600, 2000);
        List<Double> discountAmounts = amounts.stream()
                .filter(a -> a>=1000)
                .map(a -> a*0.9)
                .toList();
        System.out.println(discountAmounts);

        List<String> names = List.of("Laptop", "", "MOUSE", "Keyboard", " ");
        List<String> normalizedNames = names.stream()
                .filter(a -> !a.isBlank())
                .map(a -> a.toLowerCase())
                .toList();
        System.out.println(normalizedNames);

        List<String> ids = List.of("emp001", "EMP002", "abc003", "emp004");
        List<String> empIds = ids.stream()
                .map(a -> a.toUpperCase())
                .filter(a -> a.contains("EMP"))
                .toList();
        System.out.println(empIds);

        List<Integer> quantities = List.of(3,8,5,12,20);
        List<Double> adjustQuantities = quantities.stream()
                .filter(a-> a>5)
                .map(a -> a*1.5)
                .toList();
        System.out.println(adjustQuantities);

        List<String> comments = List.of("  Good  ", "Bad", "  Excellent service  ", "Nice");
        List<String> cleanedComments = comments.stream()
                .map(a -> a.trim())
                .filter(a->a.length()>=5)
                .toList();
        System.out.println(cleanedComments);
    }
}

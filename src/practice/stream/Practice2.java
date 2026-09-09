package practice.stream;

import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<Integer> amounts = List.of(500,1200,800,1500,300);
        List<Double> discountedAmounts = amounts.stream()
                .filter(a -> a>1000)
                .map(a -> a*0.95)
                .toList();
        System.out.println(discountedAmounts);

        List<String> names = List.of(" Duke ", "", "Levi", "  Chovy  ", " ");
        List<String> normalizedNames = names.stream()
                .filter(a -> !a.isBlank())
                .map(a -> a.trim().toLowerCase())
                .toList();
        System.out.println(normalizedNames);

        List<String> productIds = List.of("p001", "P002", "p003", "X004");
        List<String> normalizedIds = productIds.stream()
                .map(String::toUpperCase)
                .filter(a -> a.contains("P"))
                .toList();
        System.out.println(normalizedIds);

        List<Integer> salaries = List.of(45000, 62000, 58000, 72000, 38000);
        List<Integer> adjustedSalaries = salaries.stream()
                .filter(a -> a>50000)
                .map(a -> (int)(a*1.1))
                .toList();
        System.out.println(adjustedSalaries);

        List<String> comments = List.of("  Good  ", "Bad", "  Excellent service  ", "  Nice  ");
        List<String> cleanedComments = comments.stream()
                .map(String::trim)
                .filter(a -> a.length()>5)
                .toList();
        System.out.println(cleanedComments);

        List<Integer> quantities = List.of(2,8,15,4,20);
        List<Double> adjustedQuantities = quantities.stream()
                .filter(a -> a>5)
                .map(a -> a*1.5)
                .toList();
        System.out.println(adjustedQuantities);

        List<String> emails = List.of(" duke@test.com ", "", "LEVI@test.com", "  CHOVY@test.com ");
        List<String> cleanedEmails = emails.stream()
                .map(a -> a.trim().toLowerCase())
                .filter(a -> !a.isEmpty())
                .toList();
        System.out.println(cleanedEmails);

        List<Integer> stocks = List.of(10,0,5,20,3);
        List<Integer> adjustedStocks = stocks.stream()
                .filter(a -> a>5)
                .map(a -> a+2)
                .toList();
        System.out.println(adjustedStocks);

        List<String> addresses = List.of("  Taipei City  ", "", "Kaohsiung City", "  Taichung City  ");
        List<String> cleanedAddresses = addresses.stream()
                .filter(a -> !a.isBlank())
                .filter(a -> a.contains("City"))
                .map(String::trim)
                .toList();
        System.out.println(cleanedAddresses);

        List<Integer> scores = List.of(55,70,85,40,90);
        List<Integer> adjustedScores = scores.stream()
                .map(a -> a+5)
                .filter(a -> a>60)
                .toList();
        System.out.println(adjustedScores);
    }
}

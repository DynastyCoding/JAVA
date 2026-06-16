package Java.others;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateIntervalCalculator {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.now();

        long days = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("differ " + days + " days.");
    }
}

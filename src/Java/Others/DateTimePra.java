package Java.Others;

import java.time.LocalDate;

public class DateTimePra {
    public static void main(String[] args) {

        //取得今日日期
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //取得指定日期(不用補0)
        LocalDate date = LocalDate.of(1989, 6, 4);
        System.out.println(date);

        //字串轉成日期(要補0)
        String date2 = "1989-06-04";
        LocalDate d = LocalDate.parse(date2);
        System.out.println(d);

        //日期增減
        LocalDate today2 = LocalDate.now();
        LocalDate lastYear = today2.minusYears(1);
        LocalDate yesterday = today2.minusDays(1);
        LocalDate tomorrow = today2.plusDays(1);
        LocalDate nextWeek = today2.plusWeeks(1);
        LocalDate nextMonth = today2.plusMonths(1);
        LocalDate nextYear = today2.plusYears(1);
        System.out.println("Last year:" + lastYear +
                "\nYesterday:" + yesterday +
                "\nTomorrow:" + tomorrow +
                "\nNext week:" + nextWeek +
                "\nNext month:" + nextMonth +
                "\nNext year:" + nextYear);

        //只取年、月、日
        LocalDate d2 = LocalDate.now();
        int year = d2.getYear();
        int month = d2.getMonthValue();
        int day = d2.getDayOfMonth();
        System.out.println("year:"+year+"\nmonth:"+month+"\nday:"+day);

        //日期比較
        LocalDate d3 = LocalDate.now();
        LocalDate d4 = LocalDate.of(1989,6,4);
        System.out.println(d3.isBefore(d4));
        System.out.println(d3.isAfter(d4));
        System.out.println(d3.isEqual(d4));

        //閏年、轉字串

    }
}

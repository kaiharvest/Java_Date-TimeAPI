package programmer_zaman_now.belajar_java_datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class YearTest {

    @Test
    void create() {
        Year year1 = Year.now();
        Year year2 = Year.of(1990);
        Year year3 = Year.parse("2000");

        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);

        YearMonth yearMount1 = YearMonth.now();
        YearMonth yearMount2 = YearMonth.of(1990, Month.JANUARY);
        YearMonth yearMount3 = YearMonth.parse("2000-08");

        System.out.println(yearMount1);
        System.out.println(yearMount2);
        System.out.println(yearMount3);

        MonthDay monthDay1 = MonthDay.now();
        MonthDay monthDay2 = MonthDay.of(Month.AUGUST, 18);
        MonthDay monthDay3 = MonthDay.parse("--10-09");

        System.out.println(monthDay1);
        System.out.println(monthDay2);
        System.out.println(monthDay3);
        
    }

    @Test
    void year() {
        Year year = Year.now();
        LocalDate localDate = year.atMonth(Month.JANUARY).atDay(19);
        System.out.println(localDate);

        MonthDay monthDay = MonthDay.from(localDate);
        System.out.println(monthDay);
    }

    @Test
    void get() {
        Year year = Year.now();
        YearMonth yearMonth = YearMonth.now();
        MonthDay monthDay = MonthDay.now();

        System.out.println(year.getValue());
        System.out.println(yearMonth.getYear());
        System.out.println(yearMonth.getMonth());
        System.out.println(monthDay.getMonth());
        System.out.println(monthDay.getDayOfMonth());
    }
}

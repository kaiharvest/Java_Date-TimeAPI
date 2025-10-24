package programmer_zaman_now.belajar_java_datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {

    @Test
    void test() {
        Clock clock1 = Clock.systemUTC();
        Clock clock2 = Clock.systemDefaultZone();
        Clock clock3 = Clock.system(ZoneId.of("Asia/Jakarta"));

        System.out.println(clock1);
        System.out.println(clock2);
        System.out.println(clock3);
    }

    @Test
    void instant() throws InterruptedException {
        Clock clock1 = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant1 = clock1.instant();
        System.out.println(instant1);

        Thread.sleep(1_000);

        Instant instant2 = clock1.instant();
        System.out.println(instant2);
    }

    @Test
    void fromClock() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clock);
        System.out.println(year);

        YearMonth yearMonth = YearMonth.now(clock);
        MonthDay monthDay = MonthDay.now(clock);
        LocalTime localTime = LocalTime.now(clock);
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        OffsetTime offsetTime = OffsetTime.now(clock);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clock);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clock);

        System.out.println(yearMonth);
        System.out.println(monthDay);
        System.out.println(localTime);
        System.out.println(localDateTime);
        System.out.println(offsetTime);
        System.out.println(offsetDateTime);
        System.out.println(zonedDateTime);
    }
}

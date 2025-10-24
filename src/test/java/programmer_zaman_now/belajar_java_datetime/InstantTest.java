package programmer_zaman_now.belajar_java_datetime;

import org.junit.jupiter.api.Test;

import java.time.*;

public class InstantTest {

    @Test
    void create() {
        Instant instant = Instant.now();
        System.out.println(instant);

        Instant instant1 = Instant.ofEpochMilli(0);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochMilli(0);
        System.out.println(instant2);
    }

    @Test
    void modify() {
        Instant instant1 = Instant.now();
        Instant instant2 = instant1.plusMillis(1000);
        Instant instant3 = instant1.minusMillis(1000);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);

    }

    @Test
    void get() {
        Instant instant = Instant.now();

        System.out.println(instant.toEpochMilli());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
    }

    @Test
    void fromInstant() {
        Instant instant = Instant.now();

        ZoneId zoneId = ZoneId.of("Asia/Jakarta");

        LocalTime localTime = LocalTime.ofInstant(instant, zoneId);
        System.out.println(localTime);

        LocalDateTime loacalDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(loacalDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);

        OffsetTime offsetTime = OffsetTime.ofInstant(instant, zoneId);
        System.out.println(offsetTime);

    }

    @Test
    void toInstant() {
        Instant instant1 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        System.out.println(instant1);

        Instant instant2 = ZonedDateTime.now().toInstant();
        System.out.println(instant2);

        Instant instant3 = OffsetDateTime.now().toInstant();
        System.out.println(instant3);
    }
}

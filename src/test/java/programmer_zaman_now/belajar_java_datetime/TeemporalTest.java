package programmer_zaman_now.belajar_java_datetime;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class TeemporalTest {

    @Test
    void temporal() {
        Temporal temporal1 = LocalDate.now();
        Temporal temporal2 = LocalTime.now();
        Temporal temporal3 = ZonedDateTime.now();
        Temporal temporal4 = Year.now();
    }

    @Test
    void temporalAmound() {
        Temporal temporal1 = LocalDateTime.now();
        Temporal temporal2 = temporal1.plus(Duration.ofHours(10));
        Temporal temporal3 = temporal1.plus(Period.ofDays(10));

        System.out.println(temporal1);
        System.out.println(temporal2);
        System.out.println(temporal3);
    }

    @Test
    void temporalUint() {
        long temporal = ChronoUnit.DAYS.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
        System.out.println(temporal);
    }
}

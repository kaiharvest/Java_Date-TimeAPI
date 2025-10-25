package programmer_zaman_now.belajar_java_datetime;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {

    @Test
    void test() {
        Duration duration1 = Duration.ofHours(10);
        Duration duration2 = Duration.ofMinutes(10);
        Duration duration3 = Duration.ofMillis(10);

        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
    }

    @Test
    void get() {
        Duration duration1 = Duration.ofHours(50);

        System.out.println(duration1.toDays());
        System.out.println(duration1.toHours());
        System.out.println(duration1.toMinutes());
        System.out.println(duration1.toSeconds());
        System.out.println(duration1.toMillis());
    }
    
    // menghitung duration

    @Test
    void between() {
        Duration duration1 = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(10));
        System.out.println(duration1.toHours());
        System.out.println(duration1.toMinutes());

        Duration duration2 = Duration.between(LocalDateTime.now().plusHours(10), LocalDateTime.now());
        System.out.println(duration2.toHours());
        System.out.println(duration2.toMinutes());
    }
}

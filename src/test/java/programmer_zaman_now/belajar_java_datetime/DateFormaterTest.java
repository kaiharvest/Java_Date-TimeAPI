package programmer_zaman_now.belajar_java_datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormaterTest {

    @Test
    void parsing() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate date = LocalDate.parse("2003 01 27", formatter);
        System.out.println(date);
    }

    @Test
    void formating() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate date = LocalDate.parse("2003 01 27", formatter);
        String format = date.format(formatter);

        System.out.println(format);
    }

    @Test
    void defaultFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");

        LocalDate date = LocalDate.parse("2003 01 27", formatter);
        String format = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(format);
    }

    @Test
    void i18n() {
        Locale locale = new Locale("id", "ID");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMMM dd", locale);

        LocalDate localDatedate = LocalDate.now();
        String format = localDatedate.format(formatter);

        System.out.println(format);
    }
}

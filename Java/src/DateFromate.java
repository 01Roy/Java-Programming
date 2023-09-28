import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFromate {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // datetime formater
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy");
        String dtm = dt.format(df);
        System.out.println(dtm);

    }
}

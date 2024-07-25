import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class date_time_2 {
    public static void main(String[] args) {
        LocalDateTime df=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss z");
        System.out.println(df);

    }
}

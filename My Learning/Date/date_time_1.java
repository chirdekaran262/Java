import java.util.*;
import java.time.*;

public class date_time_1 {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        LocalDate l=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(l);
       
    }
}

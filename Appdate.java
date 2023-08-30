
import java.util.*;
import java.text.*;
import java.time.*;

public class Appdate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        Date date1 = sd.parse("19/08/2023");

        System.out.println(date1);
        
        // instanciando Date a partir de uma data no format iSO 8601
        Date y = Date.from(Instant.parse("2023-08-19T19:07:00Z"));
        System.out.println(y);

        // Calender
        Calendar cal = Calendar.getInstance();
        cal.setTime(y);
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println(minutes);
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
    }
}

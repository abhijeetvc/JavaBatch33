//Java 8: Duration and Period
//Duration - Can be measured in seconds
//Period - can be measured in years, months and days

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JavaEightDate {

    public static void main(String[] args) {
        DateFormat df=new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date=new Date();
        System.out.println(df.format(date));

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String strDate="29/09/2020";
        LocalDate localDate=LocalDate.parse(strDate,formatter);
        System.out.println(localDate);
        System.out.println(LocalDate.now());

    }
}

// Find the number of years between two dates(Required output: ? years ,? months,? days)
// Find the number of seconds in specified no. of hours
// Find the first value and any random value from the list

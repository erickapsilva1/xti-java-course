package br.com.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Dates2 {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, Calendar.JANUARY, 12);
        Date date = calendar.getTime();

        // Date formatting
        DateFormat dateFormat = DateFormat.getDateInstance();
        System.out.println(date); // default
        System.out.println(dateFormat.format(date)); // formatted

        // Time formatting
        dateFormat = DateFormat.getTimeInstance();
        System.out.println(dateFormat.format(date)); // formatted

        // Date and Time formatting
        dateFormat = DateFormat.getDateTimeInstance();
        System.out.println(dateFormat.format(date)); // formatted

        // Date Formatting Style
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Full: " + dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("Long: " + dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Medium: " + dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("Short: " + dateFormat.format(date));

        // Parse date
        Date date2 = dateFormat.parse("12/02/1998");
        System.out.println(date2);

        // SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.parse("01/09/1991"));


    }
}

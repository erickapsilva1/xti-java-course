package br.com.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Dates3 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(1980, Calendar.FEBRUARY, 23);
        Date date = calendar.getTime();

        Locale myDefault = Locale.getDefault();
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeIndia = new Locale("in", "IN");
        Locale localeUsa = Locale.US;
        Locale localeJapan = Locale.JAPAN;
        Locale localeItaly = Locale.ITALY;
        System.out.println(myDefault);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeUsa);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        System.out.println(dateFormat.format(date));

    }
}

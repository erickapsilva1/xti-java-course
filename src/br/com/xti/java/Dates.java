package br.com.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        // 1970.01.01

        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date);

        Date date2 = new Date(1_000_000_000_000L);
        System.out.println(date2);

        // Methods
        date.getTime();
        date.setTime(1_000_000_000_000L);
        System.out.println(date.compareTo(date2));

        Calendar c = Calendar.getInstance(); // gregorian calendar
        c.set(1980, Calendar.FEBRUARY, 12);
        System.out.println(c.getTime());

        System.out.println(c.get(Calendar.YEAR));  // get year
        System.out.println(c.get(Calendar.MONTH));  // get month - from 0 to 11
        System.out.println(c.get(Calendar.DAY_OF_WEEK));  // get day

        c.set(Calendar.YEAR, 1972); // changes the year
        c.set(Calendar.MONTH, Calendar.MARCH); // changes the month
        c.set(Calendar.DAY_OF_MONTH, 25); // changes the month

        System.out.println(c.getTime());

        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);

        System.out.println(c.getTime());

        c.add(Calendar.DAY_OF_MONTH, 1);
        c.add(Calendar.YEAR, -9);
        System.out.println(c.getTime());

        //Adds the specified (signed) amount to the specified calendar field without changing larger fields.
        c.roll(Calendar.DAY_OF_MONTH, 20);
        System.out.println(c.getTime());

        // Greetings
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        if(hour <= 12){
            System.out.println("Good morning");
        }else if(hour <= 18){
            System.out.println("Good afternoon");
        }else{
            System.out.println("Good evening");
        }

    }
}

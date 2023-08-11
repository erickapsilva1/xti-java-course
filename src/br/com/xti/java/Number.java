package br.com.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Number {
    public static void main(String[] args) throws ParseException {

        double balance = 123_456.789;

        NumberFormat numberFormat = NumberFormat.getNumberInstance(); // generic
        System.out.println(numberFormat.format(balance));

        numberFormat = NumberFormat.getIntegerInstance(); // only integer
        System.out.println(numberFormat.format(balance));

        numberFormat = NumberFormat.getPercentInstance(); // percentage
        System.out.println(numberFormat.format(.25));

        numberFormat = NumberFormat.getCurrencyInstance(); // currency
        System.out.println(numberFormat.format(.25));

        numberFormat.setMaximumFractionDigits(1);
        System.out.println(numberFormat.format(balance)); // max fraction digits

        // Internationalization
        numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(numberFormat.format(balance));

        numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(numberFormat.format(balance));

        numberFormat = NumberFormat .getCurrencyInstance();
        System. out. println(numberFormat.parse("R$ 1.100,25"));


    }
}

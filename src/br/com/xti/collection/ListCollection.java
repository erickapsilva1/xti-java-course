package br.com.xti.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Soccer");
        list.add("Basketball");
        list.add("Football");
        list.add("Tennis");
        list.add("Swimming");
        list.add("Hockey");
        list.add("Boxing");
        list.add("Swimming");

        System.out.println(list);

        for(int i=0; i < list.size(); i++){
            String letter = list.get(i);
            list.set(i, letter.toUpperCase());
        }

        System.out.println(list);
        System.out.println(list.indexOf("BOXING"));
        System.out.println(list.subList(2, 4));
        list.subList(2, 4).clear();
        System.out.println(list);


    }
}

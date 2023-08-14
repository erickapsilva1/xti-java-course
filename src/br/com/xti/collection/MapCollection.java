package br.com.xti.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {
    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<>();
        countries.put("BR", "Brazil");
        countries.put("RU", "Russia");
        countries.put("IN", "India");
        countries.put("CN", "China");

        System.out.println(countries);

        System.out.println(countries.containsKey("BR"));
        System.out.println(countries.containsKey("US"));

        System.out.println(countries.containsValue("China"));
        System.out.println(countries.containsValue("Germany"));

        System.out.println(countries.get("BR"));
        System.out.println(countries.get("CA"));

        System.out.println(countries.remove("IN"));
        System.out.println(countries);

        Set<String> keys = countries.keySet();
        for(String key : keys){
            System.out.println(key + ":" + countries.get(key));
        }

    }
}

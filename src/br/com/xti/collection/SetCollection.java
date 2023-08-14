package br.com.xti.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {

        String[] colours = {"Green", "Yellow", "Blue", "White",
        "Blue", "Yellow", "Green"};

        List<String> list = Arrays.asList(colours);
        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}

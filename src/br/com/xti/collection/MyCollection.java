package br.com.xti.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyCollection {
    public static void main(String[] args) {

        // Fundamentals
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("E");
        collection.add("I");
        System.out.println(collection.toString());
        System.out.println(collection.isEmpty());
        System.out.println(collection.contains("Z"));
        collection.remove("A");
        System.out.println(collection.toString());

        // Groups
        Collection<String> collection1 = Arrays.asList("O", "U");
        collection.addAll(collection1);
        System.out.println(collection);
        System.out.println(collection.containsAll(collection1)); // check if all elements exists
        collection.removeAll(collection1);
        System.out.println(collection.toString());

        // Go through the elements
        for (String string: collection) {
            System.out.println(string);
        }

        // Convert Collection to Array
        String[] newCollection = collection.toArray(new String[collection.size()]);
        System.out.println(Arrays.toString(newCollection));

        // Clearing collection
        collection.clear();
        System.out.println(collection.toString());

    }
}

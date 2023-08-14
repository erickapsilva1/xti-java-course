package br.com.xti.collection;

import java.util.*;

public class UtilityCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Guarana");
        list.add("Grapefruit");
        list.add("Mango");
        list.add("Coconut");
        list.add("Acai Berry Fruit");
        list.add("Banana");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.addAll(list, "Cupuaçu Fruit", "Orange", "Orange");
        System.out.println(list);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        System.out.println(Collections.frequency(list, "Orange"));
        System.out.println(Collections.frequency(list, "Guarana"));

        List<String> list1 = Arrays.asList("Acerola", "Graviola");
        System.out.println(Collections.disjoint(list, list1));

        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "Guarana"));

        Collections.fill(list, "Banana");
        System.out.println(list);

        Collection<String> finalList = Collections.unmodifiableCollection(list);
        finalList.remove(1);
        System.out.println(finalList);
    }
}

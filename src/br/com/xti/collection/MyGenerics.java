package br.com.xti.collection;

import java.util.ArrayList;

public class MyGenerics <E> {

    E element;

    public void setElement(E element){
        this.element = element;
    }

    public E getElement(){
        return element;
    }

    public double sum(ArrayList<? extends Number> list){
        double total = 0;
        for(Number number : list){
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {

        MyGenerics<String> myGenerics = new MyGenerics<>();
        myGenerics.setElement("Paranoá Lake");
        // myGenerics.setElement(51515);  // --> error
        String e = myGenerics.getElement();
        System.out.println(e.toUpperCase());

    }
}

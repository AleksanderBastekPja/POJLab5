package zad53;

import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> coffee = new ArrayList<String>();
        coffee.add("espresso");
        coffee.add("latte");
        coffee.add("cappuccino");
        coffee.add("auLait");
        coffee.add("macchiato");

        Iterator<String> kinds = coffee.iterator();
        coffee.forEach(System.out::println);
        coffee.forEach((String it) -> System.out.println(it.toUpperCase()));

        for (String it: coffee) {
            System.out.println(it.subSequence(0,4));
        }
    }
}

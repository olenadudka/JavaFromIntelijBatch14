package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("juice");
        drinks.add("beer");
        drinks.add("tea");
        drinks.add("chai");
        drinks.add("coffee");
        drinks.add("wine");


        int count=0;
        Iterator<String> iterator = drinks.iterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            //var item=iterator.next(); java 11
            if (item.contains("e") || item.contains("a")) {
           drinks.set(count, "water");
            }
            count++;
        }
        System.out.println(drinks);
    }}
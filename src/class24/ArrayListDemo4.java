package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Salma");
        names.add("MJ");
        names.add("Josh");
        names.add(0,"Josh again");
        names.set(2, "Josh again"); //if we want to replace element
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100); //if we want to add element
        System.out.println(numbers);
        numbers.clear(); //deletes all elements from list
    }
}

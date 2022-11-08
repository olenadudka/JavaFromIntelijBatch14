package review11;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        //sort and remove duplicate from ArrayList
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(150000);
        numbers.add(120000);
        numbers.add(130000);
        numbers.add(140000);
        numbers.add(140000);
        Set<Integer> set=new TreeSet<>(); //converts ArrayList to the TreeSet
      /*  numbers.clear();
        numbers.addAll(set);*/

        ArrayList<Integer> numbers2=new ArrayList<>(set);
        System.out.println(numbers2);
    }
}

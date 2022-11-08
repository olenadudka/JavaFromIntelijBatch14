package class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);

        HashSet<Integer> setNumbers=new HashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers); //[20,10], not allows duplicates

        LinkedHashSet<Integer> setNumbers2=new LinkedHashSet<>();
        setNumbers2.add(10);
        setNumbers2.add(10);
        setNumbers2.add(10);
    }
}

package class24;

import java.util.ArrayList;

public class ArrayListHW {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();

        names.add("Olena");
        names.add("John");
        names.add("Daria");
        names.add("Kiril");
        names.add("Adel");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("John"));
        System.out.println(names.size());

    }
}

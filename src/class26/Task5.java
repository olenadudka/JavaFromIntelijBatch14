package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that
        insertion order is maintained. Then remove any city that starts with “A”;
         */
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Washington DC");
        cities.add("Almata");
        cities.add("Kherson");
        cities.add("Aramil");
        cities.add("New York");
        cities.add("Kiev");
        ArrayList<String> citiesNew=new ArrayList<>(cities);
       cities.removeIf(item->item.startsWith("A"));
        System.out.println(cities);

    }
}

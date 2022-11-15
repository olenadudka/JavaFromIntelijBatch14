package class29;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.

         */
        Map<String,String> countries=new TreeMap<>();
        countries.put("Ukraine", "Kyiv");
        countries.put("Moldova","Kishinev");
        countries.put("Poland","Warshaw");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");

        Set<String> keys=countries.keySet();// KeySet metod returns a Set contains all the keys of a Map
        //Collection<String> keys=items.keySet();
        for(String key:keys){
            System.out.print(key+" ");
        }
        System.out.println();
        Collection<String> values=countries.values();
        for(String value:values){
            System.out.print(value+" ");
        }
        System.out.println("_______________________");
        //using iterator
        var iterator=countries.entrySet().iterator();
        while(iterator.hasNext()){
            var item=iterator.next();
            String key= item.getKey();
            String value=item.getValue();
            System.out.println(key);
            System.out.println(value);
        }

    }}


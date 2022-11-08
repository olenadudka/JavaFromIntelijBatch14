package class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3Iterator {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99); //to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 0.99);
        fruit.put("Banana", 12.0); //it replace previous value
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));

       Set<String> keySet= fruit.keySet(); //returns all keys in the form of set
        System.out.println(keySet); //[Apple,Mango, Orange, Banana]

        var values=fruit.values();
        System.out.println(values);
    }
}

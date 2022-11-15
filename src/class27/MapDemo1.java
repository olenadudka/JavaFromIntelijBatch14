package class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99); //to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 0.99);

        System.out.println(fruit);
        System.out.println(fruit.get("Orange"));
        fruit.remove("Mango"); //delete this key and its value
        System.out.println(fruit.containsKey("Apple"));//true
        System.out.println(fruit.containsKey("kiwi")); //false
        System.out.println(fruit.containsValue(4.99)); //searches the map for this value
        System.out.println(fruit.isEmpty());

        fruit.replace("Apple", 2.99);




    }
}

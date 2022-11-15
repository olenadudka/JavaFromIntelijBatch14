package reviewClass13;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        //I want method that takes a map and return a set sontaining all the keys from map

        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        Set<String> keys=getKeys(items); // List<String> keys=getKeys(items);
        for(var key:keys){
            System.out.println(key);
        }
        List<Double> values=getValues(items);
        System.out.println(values);
    }
    public static Set<String> getKeys(Map<String,Double> map) {//public static List<String> getKeys(Map<String,Double> map) {
        return map.keySet(); //return new ArrayList<>(map.keySet())
    }
    public static List<Double> getValues(Map<String, Double> map){  //map is just variable name
        return new ArrayList<>(map.values());
    }

}

package class29;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
         */
        Map<Integer, String> bestBuy=new HashMap<>();
        bestBuy.put(4658565, "Printer");
        bestBuy.put(586589, "Scanner");
        bestBuy.put(526589,"TV");
        bestBuy.put(5689698,"Monitor");
        bestBuy.put(586587,"IPhone");

        var entrySet=bestBuy.entrySet();
        System.out.println(entrySet);
        for(var item:entrySet){
            System.out.println(item.getKey()+" "+item.getValue());
        }

    }
}

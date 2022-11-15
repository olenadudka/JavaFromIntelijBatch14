package repls;

import java.util.HashMap;
import java.util.Map;

public class repl203Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
    }
}

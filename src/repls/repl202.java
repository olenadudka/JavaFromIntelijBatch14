package repls;

import java.util.LinkedHashMap;
import java.util.Map;

public class repl202 {
    public static void main(String[] args) {
      Map<String,String> food=new LinkedHashMap<>();
        food.put("1 item","apple");
        food.put("2 item","banana");
        food.put("3 item","pear");
        food.put("4 item", "tomato");
        food.put("5 item", "mango");
        food.put("6 item", "kiwi");
 for(Map.Entry<String,String> entry: food.entrySet()){
     System.out.println("Key is "+entry.getKey()+" and value is "+entry.getValue());
 }

 }
    }


package repls;

import java.util.HashMap;
import java.util.Map;

public class repl207 {
    public static void main (String[] args){
        Map<String, String> map=new HashMap<>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        var entrySet =map.entrySet();
        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            var item=iterator.next();
            String key=item.getKey();
            String value=item.getValue();
            System.out.println(key+" : "+value);


        }
        map.replace("ONE","AAA","ASEL");
        map.replace("FIVE","EEE","SUMAIR");
        var iterator2=map.entrySet().iterator();
        while(iterator2.hasNext()){
            var item=iterator2.next();
            String key=item.getKey();
            String value=item.getValue();
            System.out.println(key+" : "+value);
        }

    }}

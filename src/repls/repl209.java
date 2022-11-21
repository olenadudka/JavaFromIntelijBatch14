package repls;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class repl209 {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList=new ArrayList<>();
        Map<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20);
        appleMap.put("Quantity",10);


        Map<String,Object> orangeMap=new LinkedHashMap<>();
        appleMap.put("Items", "Orange");
        appleMap.put("Price", 21.99);
        appleMap.put("Quantity",10);

        dataList.add(appleMap);
        dataList.add(orangeMap);

        double price;
        double quantity;
        double total=0;

        for(Map<String,Object> listData: dataList){
            for(var entry:listData.entrySet()){
                if(entry.getKey().equals("Price")) {
                    price = (double) entry.getValue();
                }else if(entry.getKey().equals("Quantity")){
                    quantity=(int)entry.getValue();
                }
                System.out.println(entry.getKey()+": "+entry.getValue());
                }
          //  total+=price*quantity;
            System.out.println("Subtotal "+(total));
            }
        }
    }


package class28;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        //if I want to remove the items if their price is more than 10
        items.values().removeIf(price-> price>10);

       /* Iterator<Double> iterator=items.values().iterator(); //first w ea re getting a collection of values than a iterator

        while(iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }*/
        System.out.println(items);

    }
}

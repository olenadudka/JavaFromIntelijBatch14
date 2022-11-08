package class27;

import java.util.HashMap;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99); //to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 0.99);

      /* Set<String> allKeys= fruit.keySet(); //getting all the keys in the form of set
        System.out.println(allKeys);
        Iterator<String> iterator=allKeys.iterator();//getting an iterator on that set
        while(iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }
        System.out.println(fruit);*/
        fruit.keySet().removeIf(x->x.contains("n"));
    }
}

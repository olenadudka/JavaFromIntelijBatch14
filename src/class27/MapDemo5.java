package class27;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit=new HashMap<>();
        fruit.put("Apple", 1.99); //to store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.99);

      /*  Collection<Double> values=fruit.values(); //returns all the values from a map

        //remove all values that more than 2 dollars
        Iterator<Double> iterator=values.iterator();
        while(iterator.hasNext()){
            double value=iterator.next();
            if(value>2){
                iterator.remove();
            }
        }
        System.out.println(fruit);*/

        fruit.values().removeIf(x->x>2); //lambda
        System.out.println(fruit);
    }
}

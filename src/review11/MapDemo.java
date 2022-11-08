package review11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        /*
        HashMap: Doesn't retaint the order, but it's fastest
        LinkedHashMap:it retains the order but it is a little slower than HashMap
        TreeMap when we want to sort the data but it is slowest
         */
        Map<String, Double> vegeList=new LinkedHashMap<>();

    }
}

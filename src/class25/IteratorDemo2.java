package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");
        beautyProducts.add("conditioner");
        beautyProducts.add("primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");


        Iterator<String> iterator= beautyProducts.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println(iterator.next());
        }
        System.out.println(beautyProducts);
    }
}

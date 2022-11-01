package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
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


        //get the iterator from the list
       Iterator<String> iterator= beautyProducts.iterator();
        /*System.out.println(iterator.hasNext()); //we have 1 item
        System.out.println(iterator.next());//it gives us the item and remove it from iterator
        System.out.println(iterator.hasNext());*/

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

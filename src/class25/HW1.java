package class25;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.

         */
        ArrayList <String> words=new ArrayList<>();
        words.add("sun");
        words.add("hope");
        words.add("power");
        words.add("love");
        words.add("kindness");
        words.add("beauty");

        words.removeIf(item->item.endsWith("e"));
        System.out.println(words);
    }
}

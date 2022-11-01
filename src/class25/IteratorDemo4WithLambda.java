package class25;

import java.util.ArrayList;

public class IteratorDemo4WithLambda {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");


        beautyProducts.removeIf(item->item.startsWith("B"));
        System.out.println(beautyProducts);
    }
}

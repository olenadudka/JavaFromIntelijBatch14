package class25;

import java.util.ArrayList;

public class ContainsAll {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
       beautyProducts.add("Blush");
       beautyProducts.add("Base");
       beautyProducts.add("concealer");
       beautyProducts.add("Mascara");
       beautyProducts.add("eyeLinear");
       beautyProducts.add("Lipstick");
       beautyProducts.add("Dove soap");
       beautyProducts.add("Dove soap");
       beautyProducts.add("conditioner");
       beautyProducts.add("shampoo");
       beautyProducts.add("lotion");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("conditioner");
       cosmetics.add("shampoo");
       cosmetics.add("lotion");

        //System.out.println(beautyProducts.contains("lipstick"));
       // System.out.println(beautyProducts.contains("Mascara"));
        //System.out.println(beautyProducts.contains("Lotion"));

        System.out.println(beautyProducts.containsAll(cosmetics));
    }
}

package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String>makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("Lipstick");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("conditioner");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");

        ArrayList<String> beautyProducts=new ArrayList<>();
        //adds everything from makeUpItems to beautyProducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);

        beautyProducts.remove("lotion"); //remove 1 element

        beautyProducts.removeAll(cosmetics); //removed everything from cosmetics array
        beautyProducts.clear();//remove all elements. we will have empty array


    }
}

package class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("Lipstick");



        ArrayList<String>ItemsToBeRemoved=new ArrayList<>();
        ItemsToBeRemoved.add(("Blush"));
        ItemsToBeRemoved.add(("Base"));
        ItemsToBeRemoved.add(("concealer"));

        makeUpItem.removeAll(ItemsToBeRemoved);
        System.out.println(makeUpItem);
        // makeUpItem.clear();//it removes everything

    }
}

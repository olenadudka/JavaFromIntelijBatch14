package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(1.2f);
        floats.add(2.4f);
        floats.add(4f);
        System.out.println(floats);

    }
}

package repls;

import java.util.Iterator;
import java.util.LinkedList;

public class repl189 {
    public static void main(String[] args) {
        LinkedList<Integer> objects = new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            objects.add(i);
            Iterator<Integer> iterator = objects.iterator();
            while (iterator.hasNext()) {
                int item = iterator.next();
                if (item % 3 != 0) {
                    iterator.remove();}

                }
            }
            System.out.println(objects);
        }
    }


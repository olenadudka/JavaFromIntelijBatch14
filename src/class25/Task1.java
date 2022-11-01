package class25;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
          /*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
 */
        ArrayList <String> names=new ArrayList<>(5);
        names.add("Nesrin");
        names.add("Vidaya");
        names.add("Olena");
         names.add("Jami");
         names.add("Jam");
        System.out.println(names.isEmpty()); //is given arrayList is empty or not
        System.out.println(names.contains("Jam"));//true
        System.out.println("Dam");//false
        System.out.println(names.size()); //5
        System.out.println(names);
    }
}

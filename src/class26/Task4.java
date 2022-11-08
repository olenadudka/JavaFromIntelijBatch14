package class26;

import java.util.ArrayList;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries. In this set we
         want all objects to be sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Ukraine");
        treeSet.add("France");
        treeSet.add("USA");
        treeSet.add("Germany");
        treeSet.add("Australia");
        System.out.println(treeSet);

        ArrayList<String> arrays=new ArrayList<>(treeSet);
        for(String array:arrays){
            System.out.print(array+" ");
        }
    }
}

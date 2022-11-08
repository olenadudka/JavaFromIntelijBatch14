package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemovingElements {
    public static void main(String[] args) {
        /*
        How can you remove all duplicates from ArrayList?*/

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
        LinkedHashSet<String> noDublicates=new LinkedHashSet<>(aList);
        System.out.println(noDublicates);
    }
}

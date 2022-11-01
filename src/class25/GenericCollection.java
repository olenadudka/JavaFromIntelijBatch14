package class25;

import java.util.ArrayList;

public class GenericCollection {
    public static void main(String[] args) {

        //non generic way of using collection framework this is how your ancestors use to write code before java
        // 1.5 it causes a lot of problems at run time because java don't know at compile time what type of data
        //you are sting in this class and because java doesnt know in can't help you avoid errors
        ArrayList names=new ArrayList<>();
        names.add("Serhiy");
        names.add(10);
        //System.out.println(names);

     //   System.out.println((String).names.get(0)).length());
    }
}

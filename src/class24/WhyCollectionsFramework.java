package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
      /* if we have to store single value, we use variables*/
       String name="Josh";
        String name2="Joe";
        System.out.println(name);
        System.out.println(name2);
        /*
        if we have to store more than 2 values of same kind of data than we should go with arrays
         */

        String[] names={"Reshad", "Adam", "Again Josh"};
        //fixed in size
        String[] breeds=new String[10];
breeds[0]="Bulldogs";
        System.out.println(Arrays.toString(breeds));


        ArrayList<String> colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);
    }
}

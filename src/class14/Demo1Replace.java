package class14;

import java.util.Arrays;

public class Demo1Replace {
    public static void main(String[] args) {
        String str="jkfghklgjd&&&";
       str= str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);

        String sentence="Batch 14 is great. Batch 14 is excellent.Batch 14 is just amazing.";
        String[] split = sentence.split("[.?!]");

        System.out.println("split = " + Arrays.toString(split));

        String str2="Batch 14 is Great.Batch 14 is Great.";
        String replace = str2.replaceFirst("Great", "Good");
        System.out.println(replace);

    }
}

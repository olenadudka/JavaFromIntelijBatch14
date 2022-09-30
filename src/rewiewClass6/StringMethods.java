package rewiewClass6;

public class StringMethods {
    public static void main(String[] args) {
        String str = "hello";
//toUpperCase or toLowerCase
        str.toUpperCase();
        System.out.println(str); //hello
        System.out.println("______________");

        str = str.toUpperCase();
        System.out.println(str); //HELLO
        //length()->gives size of String
        int size = str.length();
        System.out.println(size);

        //charAt-> returns char value at the spesified index
        char letter = str.charAt(4);
        System.out.println(letter);

        //how to get last char
        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar);
        //indexOf
        int index = str.indexOf(lastChar);
        System.out.println(index);
        System.out.println(str.indexOf('a'));
//isEmpty() returns true if length more than 0
        boolean empty = str.isEmpty();
        System.out.println(empty);

        //trim();


    }
}

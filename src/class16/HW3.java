package class16;

public class HW3 {
    /*
    Create a method that will accept a String as a parameter and return a new
    String that consist only of vowels. Method should be available inside the
    class only where it was declared and executed by calling it is name.
     */
    private String returnVowels(String letters){
        String vowels=letters.replaceAll("[^aeiouAEIOU]", "");
        return vowels;
    }

    public static void main(String[] args) {
        HW3 returning=new HW3();
        System.out.println(returning.returnVowels("dfkjhfgjgjhgdOOOfkowuwe83732kjsdlfhlkj"));

    }
}

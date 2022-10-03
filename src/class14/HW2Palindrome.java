package class14;

public class HW2Palindrome {
    void palindrome(String word){
        StringBuilder stringBuilder=new StringBuilder(word);
        stringBuilder.reverse();
       if(stringBuilder.toString().equals(word)){
           System.out.println("Palindrome");

       }else{
           System.out.println("Not palindrome");

        }
    }

    public static void main(String[] args) {
        HW2Palindrome pal=new  HW2Palindrome();
        pal.palindrome("mom");
        pal.palindrome("java");
    }
}

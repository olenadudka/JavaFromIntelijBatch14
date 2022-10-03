package class15;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    void printPalindrome(String str){
        StringBuilder stringBuilder=new StringBuilder();
        str=str.toLowerCase();
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
    }

    public static void main(String[] args) {
        Task3 task=new Task3();
        task.printPalindrome("Dad");
    }
}

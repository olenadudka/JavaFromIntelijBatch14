package repls;

public class repl168 {
final String reverse(String word) {
    StringBuilder stringBuilder1=new StringBuilder(word);
    String answer=stringBuilder1.reverse().toString();
    return answer;
}


}
class Task{
    public static void main(String[] args) {
        repl168 obj=new repl168();
        obj.reverse("Hello");
        System.out.println( obj.reverse("Hello"));
    }
}

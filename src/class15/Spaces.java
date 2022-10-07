package class15;

public class Spaces {

    void spaceOut(String word) {
        for (int i = 0; i <= word.length(); i++) {
            word.charAt(i);
            System.out.print(word.charAt(i) + " ");
        }

    }

    public static void main(String[] args) {
        Spaces s=new Spaces();
        s.spaceOut("syntax");
    }
}
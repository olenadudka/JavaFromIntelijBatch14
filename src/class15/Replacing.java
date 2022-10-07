package class15;

public class Replacing {
    String censorLetter(String word,char character) {
        return word.replaceAll(word.valueOf(character),"*");

                }

    public static void main(String[] args) {
        Replacing newStr=new Replacing();
   newStr.censorLetter("mommy",'m');
        System.out.println(newStr.censorLetter("mommy",'m'));
    }

            }


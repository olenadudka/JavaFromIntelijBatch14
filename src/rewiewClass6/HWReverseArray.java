package rewiewClass6;

public class HWReverseArray {
    public static void main(String[] args) {
        String str="Tornado";
        char[] charArray=str.toCharArray();
        for(int i=charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}

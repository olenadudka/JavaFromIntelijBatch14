package rewiewClass6;

public class review1 {
    public static void main(String[] args) {
        //how would you reverse a string without using reverse function
        /*
        1. use StringBuilder and Reverse method
         */
                //to charArray HW
        String str="hello";
       String newString="";
        for(int i=str.length()-1; i>=0; i--){
            newString=newString+str.charAt(i);
        }
        StringBuilder sb=new StringBuilder();
        sb.reverse();
        System.out.println(sb);
        //
    }
}

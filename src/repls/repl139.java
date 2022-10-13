package repls;

public class repl139 {
    public String alphabetical(String str){
        String answer="";
        for (int i=0;i<str.length()-1;i+=2){

            if (str.charAt(i)>str.charAt(i+1)){
                answer+=str.charAt(i);
            } else {
                answer+=str.charAt(i+1);
            }
        }

        if (str.length()%2!=0){
            answer+=str.charAt(str.length()-1);
        }
        return answer;
    }

    public static void main(String[]args){
        repl139 main=new repl139();
        System.out.println(main.alphabetical("hello"));
        System.out.println(main.alphabetical("software"));
        System.out.println(main.alphabetical("language"));
    }
}

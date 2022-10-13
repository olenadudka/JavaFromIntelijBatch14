package class20;

public class HW3 {
    static void hobby(){
        System.out.println("I like to do nothing");
    }
    static void hobby(String str){
        System.out.println("I like to "+str);
    }
    static void hobby(String str1, String str2){
        System.out.println("I like "+str1+" and "+str2);
    }
}

class HW3Test{
    public static void main(String[] args) {
        HW3.hobby();
        HW3.hobby("play tennis");
        HW3.hobby("read books", "play piano");
    }
}
package repls;

public class repl159 {
    static void m1(int num1,int num2){
        System.out.println(num1-num2);
    }
    static void m1(int num1,int num2, int num3){
        System.out.println(num1-num2-num3);
    }
    static void m1(int num1,int num2, int num3, int num4){
        System.out.println(num1-num2-num3-num4);
    }
    public static void main(String [] args){
        m1(60, 5,5,10);
        m1(40,20);
    }

}

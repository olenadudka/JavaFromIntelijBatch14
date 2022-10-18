package repls;

public class repl175 implements FirstInterface, SecondInterface {


    public void firstMethod(){
        System.out.println("First Method implementing multiple Inheritance");
    }
    public void SecondMethod(){
        System.out.println("Second Method implementing multiple Inheritance");
    }
    public static void main (String[] args){


    }

}

interface FirstInterface{
    void firstMethod();
}
interface SecondInterface{
    void SecondMethod();
}

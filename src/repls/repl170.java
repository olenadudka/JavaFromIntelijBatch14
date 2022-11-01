package repls;

public class repl170 {
}
class MainClass extends FinalClass{
    public static void main(String[] args){
        MainClass obj=new MainClass();
        obj.method1(true);
        obj.method2("Olena");




    }
}
class FinalClass{
    final void method1(boolean isHungry){
        System.out.println("Final method with boolean parameter");
    }
    final void method2(String name){
        System.out.println("Final method with String parameter");
    }
}

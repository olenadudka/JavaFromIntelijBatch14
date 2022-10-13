package repls;

public class repl155 {
    public static void main(String[] args) {
        C obj=new C();
    }

}
class A{
    A(){
        System.out.println("I");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("am");
    }
}
class C extends B{
    C(){
  super();
        System.out.println("a tester");
    }}

package class22;

public class Parent {
    static void print(){
        System.out.println("Hello world");
    }
}
class Child extends Parent{
    static void print(){
        System.out.println("Hello there");
    }
}
class Test{
    public static void main(String[] args) {
        Child.print();
    }
}
package class19;

public class ClassA {
    //Write program to inherit class A that has method printF which is static
    // and call or reuse that method into class B
     static void printF(){
        System.out.println("Static");
    }
}
class ClassB extends ClassA {
    public static void main(String[] args) {


        ClassB info = new ClassB();
        info.printF();
    }
}
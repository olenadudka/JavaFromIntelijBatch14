package class14;

public class MethodsDemo1 {
    //A method that doesnt take any parameters and prints some lines on the Console
    void printHello(){   //defining method, just writting the rules
        System.out.println("Hello world");
        System.out.println("Hello Java");
        //A method that takes a single parameter of type string and prints it
    }
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Taivion Don't worry its Java");
        obj.printWord("No Athira it doesn't make sense I am confused");
    }
}

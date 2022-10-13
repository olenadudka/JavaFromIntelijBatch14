package class20;

public class MethodOverloadingD2 {


     void F1(String name, int number){
        System.out.println("1");
    }
    //by changing the number of parameters
    void F1(String name, int number, int number2){
        System.out.println("2");
}
//by changing data type
    void F1(int num1, int number){
        System.out.println("3");
}
    void F1( int number,String name){
        System.out.println("4");
    }

    public static void main(String[] args) {
        MethodOverloadingD2 md=new MethodOverloadingD2();
        md.F1("Taras", 20);

    }
}
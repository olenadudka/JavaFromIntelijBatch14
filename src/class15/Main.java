package class15;

public class Main {
    void mult(int num1, int num2){
        System.out.print("Multiplication "+(num1*num2));
        System.out.println();
    }
    void add(int n1, int n2){
        System.out.print("Addition " +(n1+n2));
        System.out.println();
    }

    void sub(int number1, int number2){
        System.out.print("Substraction "+(number1-number2));

    }
    public static void main (String [] args){
        Main obj=new Main();
        obj.add(10,20);
        obj.mult(10,3);
        obj.sub(40,20);

    }
}

package class14;

public class EvenOdd {
String method(int num){
    if(num%2==0){
        return "Even";
    }else{
        return "Odd";
    }

}

    public static void main(String[] args) {
    EvenOdd num=new EvenOdd();
        System.out.println(num.method(8));
    }
}

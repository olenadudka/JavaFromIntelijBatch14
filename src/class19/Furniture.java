package class19;

public class Furniture {
    String color="green";
}
class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(color); //prints local variable black
        System.out.println(this.color); //prints instance variable from same class red
        System.out.println(super.color); // from parent class green
    }
}
class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}



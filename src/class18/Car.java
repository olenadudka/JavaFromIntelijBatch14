package class18;


public class Car{
    //common class has many different names -parent class, super class, base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    // if a field or method has private access modifier in parent class child classes can't use it
    private String engineType;
    void printCarDetails(){
        System.out.println("Model "+model+"make "+make+" color "+color);
    }
}

class BMW extends Car{
    //Child classes, derived class
    double engineCC;

}

class Tesla extends Car{


}
class Toyota extends Car{

}
class CarTester{
    public static void main(String[] args) {


    BMW bmw=new BMW();
    bmw.model="x5M";
    bmw.make="BMW";
    bmw.color="Black";
    bmw.model="x8";
    bmw.printCarDetails();

}}
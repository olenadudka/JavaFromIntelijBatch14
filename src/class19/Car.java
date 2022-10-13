package class19;
class Vehicle{
    int noOfWheel;
    int topSpeed;
    public void printTopSpeed(){
        System.out.println(topSpeed);
    }
}


public class Car extends Vehicle {
    String model;
    String make;
    int year;

}

class Tesla extends Car{
void printInfo(){
    System.out.println("I am electric car");
}
}
class Toyota extends Car{
void printInfo(){
    System.out.println("I'm car with engine");
}
}

//class customcar extends Toyota,Tesla{} not allowed, diamont problem
class Tester{
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.printTopSpeed();
    }
}
package ReviewClass10;

public class TestCar {
    public static void main(String[] args) {
       Car car= new Tesla("Tesla","X", "yellow");
        car.drive();
        car.start();
        car.stop();
       // car.charge(); can't use


       Tesla tesla=new Tesla("Tesla","X","green");
       tesla.drive();
       tesla.start();
       tesla.stop();
       tesla.charge();

       //new Car(); not possible because Car is abstract class
    }
}

package ReviewClass10;


interface Drivable{
    //by default all variables public static final
    boolean DRIVES=true;
    //we cant have constructor
    //by default all methods are public abstract
    void breaks();
}
interface Vehicle{
    void haveMotor();
    //from java 8 we can have static and default methods
    default void haveBreak(){
        System.out.println("All vehicles have break");
    }
   static void honk(){
       System.out.println("All vehicles honk");
   };
}




//with abstract class we can achieve 0 to 100 % abstraction
public abstract class Car {
    String color,make,model;
    public static final int WHEELS=4;

    public Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }

    void drive(){   //completed method
        System.out.println("All cars can drive");
    }
    abstract void start();  //incomleted method

    abstract void stop();
}

class Tesla extends Car implements Drivable,Vehicle{

     Tesla(String make, String model, String color) {
        super(make, model, color);
    }
    void start() {
        System.out.println(make+" starts automatically");
    }
    void stop(){
        System.out.println(make+" stops when we press break");
    }
    public void charge(){
        System.out.println("You need to charge "+make);
    }
   public  void breaks(){
        System.out.println(make+" cane break");
    }
    public void haveMotor(){
        System.out.println(make+" have motor");
    }

    public void haveBreak(){

    }
}

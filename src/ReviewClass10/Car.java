package ReviewClass10;
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

class Tesla extends Car{

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
}

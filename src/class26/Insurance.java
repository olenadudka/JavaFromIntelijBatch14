package class26;

import java.util.ArrayList;

public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName and
     unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health.
     Car class has it’s own attribute as carModel and Class Pet has petType attribute. Create 3 objects
     of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all
     methods of the class.
     */
    String insuranceName;
public Insurance(String insuranceName){
    this.insuranceName=insuranceName;
}
    void getQuote() {
        System.out.println("You are eligible for quote");
    }
    void cancelInsurance(){
        System.out.println("If you want to cancel an insurance, call 777585658");
    }

}
class Car extends Insurance{

    String carModel;
    Car(String carModel, String insuranceName)
    {super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("You are eligible for quote for your "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println("To cancel insurance for your car you can fill the form online");
    }
}

class Pet extends Insurance{
    String petType;
    Pet(String petType, String insuranceName){
        super(insuranceName);
        this.petType=petType;
    }
    void getQuote(){
        System.out.println("You are elegible for quote for your "+petType);
    }

    @Override
    void cancelInsurance() {
        System.out.println("To cancel insurance for your "+petType+" you can call 546465454");
    }
}

class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);
    }
}
class Test{
    public static void main(String[] args) {
        Car car=new Car("Toyota", "Geico");
        Pet pet=new Pet("Cat", "Liberty");
        Health health=new Health("Insurance");

        ArrayList<Insurance> insurance=new ArrayList<>();
        insurance.add(car);
        insurance.add(pet);
        insurance.add(health);
        for(Insurance ins:insurance){
            ins.getQuote();
            ins.cancelInsurance();
        }
    }
}

package class22;

public class Animals {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hours");
    }
}
class Panda extends Animals{
    void  eat(){
        System.out.println("Pandas eat bamboos");
    }

    /*
    @override is an annotation that tells java to check for extra rules like if we are properlyoverriding a method or not
     */
    @Override
    void sleep(){
        System.out.println("Pandas sleep for 16 hours");
    }
}
class Cat extends Animals{
    void eat(){
        System.out.println("Cats like to eat fish");
    }

}
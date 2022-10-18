package class23;

public abstract class Animal {
    abstract void eat();

    abstract void sleep();

    void walk(){
        System.out.println("Animal can walk");
    }

    public static void main(String[] args) {
        //Animal animal=new Animal(); we can't create object of abstract class
    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cats like fish");
    }
    void sleep(){
        System.out.println("Cats like sleep 12-16 hours");
    }
    void showAttitude(){
        System.out.println("hmm hmm hmm");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dogs like watermelon");
    }
    void sleep(){
        System.out.println("Dogs like sleep 8-10 hours");
    }
}
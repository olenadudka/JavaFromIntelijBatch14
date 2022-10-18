package repls;

public class repl166 {
    public static void main(String[] args) {
        Animal[] animal={new Cat(null,0), new Kitten1(null, 0), new Kitten2(null,0),
                new Kitten3(null,0)};
        for(Animal answ:animal){
            answ.eat();
            answ.sleep();
        }
    }

}

class Animal{
    String name;
    int weight;
    Animal(String name, int weight){
        this.name=name;
        this.weight=weight;
    }
    public void eat(){
        System.out.println("Animals loves to eat");
    }
    public void sleep(){
        System.out.println("Animals loves to sleep");
    }

}
class Cat extends Animal{
    Cat (String name, int weight){
        super(name, weight);
    }
    @Override
    public void sleep(){
        System.out.println("Cat sleeps a lot");
    }
    public void eat(){
        System.out.println("Cat eats");
    }
}
class Kitten1 extends Cat{

    Kitten1(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat(){
        System.out.println("Kitten1 eats milk");
    }
}
class Kitten2 extends Cat{

    Kitten2(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat(){
        System.out.println("Kitten2 eats snacks");
    }
}
class Kitten3 extends Cat{

    Kitten3(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void eat(){
        System.out.println("Kitten3 eats everything");
    }
}

package class22;

public class AnimalsTester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();
        Animals animal=new Panda(); //upcasting
        //Panda panda=new Animals; //sown casting
        Animals animal1=new Cat();
        Animals[] animals={new Cat(), new Panda()};
    }
}

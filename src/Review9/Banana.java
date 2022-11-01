package Review9;

public class Banana extends Fruit {

    String origin;

    Banana(String name, String shape, String color, String origin) {
        super(name, shape, color);
        this.origin = origin;
    }

    void makeSmothie() {
        System.out.println("From " + name + " we get testy smothie");
    }
/*
when child class have same method name as super class - overriding
2 methods with the same name but inside different class

how to override
1.method signature must be same
2.return type must be the same
3. access modidfier /visibility can be same or higher
 */

   public void grow(){
       System.out.println(name+" grows fast and fresh");
   }
   //when child class have same static method as parent class
    //we are not achieving overriding
   public static void havePeel(){
       System.out.println("banana is very easy to peel");
   }
   void makePie(){
       System.out.println("Banana pie is delicious");
   }
    public static void main(String[] args) {
        Banana ban = new Banana("banana", "banana shape", "yellow", "Ecuador");


        ban.haveBenefits();//fruit
        ban.makeSmothie();
        ban.grow();

        Banana.havePeel();//banana

        //runtime polymorphism
        System.out.println("___________________");

       Fruit fruit= new Banana("banana", "Banana shape", "green","Africa");
       fruit.grow();
       fruit.haveBenefits();

       fruit.havePeel();
    }
}
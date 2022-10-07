package reviewClass7;

public class Shelter {
    public static void main(String[] args) {
        Dog.breed="Huskey";
        Dog dog1=new Dog();
        //how to access instance variables?
        dog1.name="Bob";
        dog1.weight=5;
        dog1.printInfo();
        Dog dog2=new Dog();
        System.out.println(dog2.name); //null

        dog2.name="Tommy";
        dog2.weight=10;
        dog2.printInfo();

        String str="hello";
        int size=str.length();

       double price= dog1.getPrice();
        System.out.println(price);

      double  price2=dog2.getPrice();
        System.out.println(price2);
        System.out.println(dog1.bark());
        System.out.println(dog2.bark());
        dog1.love("to jump"); //to jump - argument
        dog2.love("to play");
    }
}


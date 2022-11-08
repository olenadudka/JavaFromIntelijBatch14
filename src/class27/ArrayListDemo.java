package class27;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Dog> dogs=new ArrayList<>();

        dogs.add(new Dog("Tommy", "Black", "German"));
        dogs.add(new Dog("Jony", "White", "Bulldog"));
        dogs.add(new Dog("Kimi", "Brown", "German"));
        //longer way
        /*
        Dog dog1=new Dog("Tommy", "Black", "German")
        dogs.add(dog1);
        sout dog1 if we want to print individual box
         */

        System.out.println(dogs);
    }
}

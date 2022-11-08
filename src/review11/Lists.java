package review11;

import java.util.ArrayList;
import java.util.ListIterator;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");//when we use simple add methods that takes one parameter at the and of the list
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");

        System.out.println(animals);

        //how to print the size of each word from this list
        for (String animal : animals) {
            System.out.println(animal.length());

        }
        //how can we remove words which have more than 4 letters
       // animals.removeIf(x->x.length()>4);
       // System.out.println(animals);
        //if element is more than 4 letters replace that with Camel
        //we should not use iterator because we are not performing anyoperations that can change the size of list
        //we should not use enhanced for loop here as we are not printing the data, we are updating the data .
        //As we need the index to update the data we should use simple for loop
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).length()>4){
                animals.set(i, "Camel"); //set methods replaces the elements
            }
        }
        System.out.println(animals);
        animals.subList(0,3);
        ListIterator<String> stringListIterator= animals.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
    }
}

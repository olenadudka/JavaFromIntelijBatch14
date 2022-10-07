package class17;

public class Cat {
    /*Write java class that will have a constructor: one with parameters and second without any parameters.
    Create a separate test class where you will execute both of the constructors 1 by 1

     */
    private String name;
    private String breed;
    private String color;
    private int age;

    Cat(){

    }

    Cat(String catName, String catBreed, String catColor, int catAge) {
        name = catName;
        breed = catBreed;
        color = catColor;
        age = catAge;
    }
    void printInfo(){
        System.out.println("name "+name+" "+"breed "+breed+" age "+age);}
}
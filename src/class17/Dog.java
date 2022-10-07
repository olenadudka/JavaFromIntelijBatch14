package class17;

public class Dog {
   private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        age=dogAge;
        weight=dogWeight;

    }

    void printInfo(){
        System.out.println("name "+name+" "+"breed "+breed+" age "+age);
    }

    public static void main(String[] args) {
        /*Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="Husky";
        dog.color="pink";
        dog.age=10;
        dog.weight=30;

*/
        Dog dog=new Dog("Tomy", "Husky","Pink", 10,30);

      /*  dog.printInfo();
       Dog dog2=new Dog();
        dog2.name="Cmi";
        dog2.breed="German";
        dog2.color="green";
        dog2.age=10;
        dog2.weight=30;
       */
        Dog dog2=new Dog("Cmi","German","Pink",10,30);
        dog2.printInfo();
    }
}

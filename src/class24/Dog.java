package class24;

public class Dog {
   private String name;
    private String breed;
   private int age;
    private double weight;


    public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
      setWeight(weight);
    }
    void setName(String name){

        if(name.length()>30){
            System.out.println("Name can't be mor than 30 letters");
        }else if(name.isEmpty()){
            System.out.println("Name can't be empty Please try again");
        }else{
            this.name = name;
        }}
        void setBreed(String breed){
            if(breed.length()>20){
            System.out.println("Breed can't be mor than 20 letters");
        }else if(breed.isEmpty()){
            System.out.println("Breed can't be empty Please try again");
        }else{
            this.breed = breed;}

        }

        void setAge(int age){
        if(age>20){
            System.out.println("APlease use less age, something seems wrong here, are you sure its a dog?");
        }else if(age<0){
            System.out.println("Age can't be negative");
        }else{
            this.age=age;
        }
        }

        void setWeight(double weight){
        if(weight<0){
            System.out.println("Negative weight is not allowed, please try again");
        }else if(weight>300){
            System.out.println("Please try less than 300 its look more of an elephant");
        }else{
            this.weight=weight;
        }
        }


        String getName(){
        return name;
        }

        String getBreed(){
        return breed;
        }

        int getAge(){
        return age;
        }
        double getWeight(){
        return weight;
        }
    void printInfo(){
        System.out.println("Name "+name+" breed "+breed+" age "+age+" weight "+weight);
    }
}
class Test {
    public static void main(String[] args) {


        Dog tommy = new Dog("Tommy","German",15, 20);
//tommy.age=1500; it's possible to assign
        tommy.printInfo();
        System.out.println(tommy.getName());

    }
}
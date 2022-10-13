package class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

   Bird(String name, String color, int age, int weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;}

    void printInfo(){
        System.out.println("Name "+name+" Color "+color+" Age "+age+" weight "+weight);

    }
}

class Parrot extends Bird{
    Parrot(String name, String color, int age, int weight){
        super(name,color,age,weight);
      /*  this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;*/
    }
}

class Crow extends Bird{
    Crow(String name, String color, int age, int weight){
        super(name,color,age,weight);
      /*  this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;*/
    }
}
class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green", 2, 1);
        parrot.printInfo();

       Crow crow=new Crow("Crow","black", 1, 1);
        crow.printInfo();
    }
}
package reviewClass7;

public class Dog {
    String name; //instance variables
    int weight;
    static String breed;

    void printInfo(){
        System.out.println("Dog features: "+name+", "+weight+" ,"+breed);
    }
    //create a method to calculate price
    //if weight is more than 5 pounds ->100
    //if weight more than 10->300
    //more than 20 pounds->1000

    /*
    variables syntax
    data type name
    String     breed
     */

    double getPrice(){
        if(weight<5){
            return 100;
        }else if(weight<10){
            return 200;
        }else{
           return  1000;
        }
    }
    void love(String thing){ //string thing calls parameter
        System.out.println(name+" loves "+thing);
    }

    //create a method that will return barkType
    //if weight less than 5->loud
    //if weight less than 20 pounds ->noice is wooh
    //if eight is less 500 ->Gav Gav
 /*
    when we do not create constructor compiler creates a default constructor for us
     */
    String bark(){
        String noise;
        if(weight<5){
           noise="loud";  //local variable
        }else if(weight<20) {
            noise = "woof woof";
        } else{
            noise="GAV GAV";
        }
        return noise;
    }

}

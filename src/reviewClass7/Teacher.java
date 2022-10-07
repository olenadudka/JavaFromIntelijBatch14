package reviewClass7;

public class Teacher {
    String name,lastName;
    int experience;
    String subject;
    double salary;
    static String school;
    //how to create constructor
    //1. constructor name=class name
    //2. no return type not even void
    //using below constructor we initialize instance variables(name..)
       Teacher(String fname,String lname){
          name=fname;
          lastName=lname;
          //when you create constructor compiler is not going to create a default constructor
           //for you

      }
      void print(){
          System.out.println(name+" "+lastName);
      }
}

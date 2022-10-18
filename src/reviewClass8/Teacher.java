package reviewClass8;

public class Teacher {
    public String name,lName;
   protected String subject;
    int experience;
   private double salary;
    public static String school;

    //this. use to reffer to the curent object: instatce variables instance methods
    public Teacher(String name, String lName){
        this.name=name;
        this.lName=lName;
//this() refers to the curent object:curent class constractor
    }

    Teacher(String name, String lName, String subject){
        this(name,lName);
        this.subject=subject;

    }

    //static method can work only with static variables
public static void work(){
    System.out.println("All teachers work at "+school);
}
   protected void print(){
        work();
        System.out.println("Teacher name is "+name+" "+lName);
    }
    void teach(){
        this.print();
        System.out.println(name+" teaches "+subject);
    }

    //method that will calculate bonus base on expirience and returns it
    private double getBonus(){
        if(experience<5){
            return 3;
        }else{
            return 3.5;
        }
    }

    }


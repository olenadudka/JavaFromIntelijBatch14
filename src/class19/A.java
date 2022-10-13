package class19;

public class A{
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
     */
    String name;
    String lastName;
    A(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public void printInfo(){
        System.out.println(name+" "+lastName);
    }
    }
class B extends A{
    B(String name, String lastName){
        super(name, lastName);}

    }
class C extends B{
    C(String name, String lastName){
        super(name, lastName);
    }
}
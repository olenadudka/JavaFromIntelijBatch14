package class16;

public class Person {
    public String name;
    int salary;
    private String password="pass123";
   public double salary1=1000;

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.password);
    }

}

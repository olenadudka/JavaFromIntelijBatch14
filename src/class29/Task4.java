package class29;

import java.util.TreeMap;

public class Task4 {
}
class Person{
    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
   public void printInfo(){
       System.out.println(name+" "+lastName+" "+age+" years old has salary "+salary);
   }
}
class Test{
    public static void main(String[] args) {
        TreeMap<Integer, Person> workers=new TreeMap<>();
        workers.put(1235, new Person("Olena", "Dudka", 33, 120000));
        workers.put(25656, new Person("Daria", "Kulagina", 25, 130000));
        workers.put(7458, new Person("Anna", "Jo", 35, 100000));
        for(var worker: workers.values()){
            worker.printInfo();
        }


    }
}

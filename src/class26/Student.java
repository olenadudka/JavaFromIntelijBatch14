package class26;

import java.util.HashSet;

public class Student {

        /*
        Create a Set collection that will hold Objects of Student Type. In this set we do not care about the insertion
         order. Each student object should have name and studentID. Display name of each student.
         */
 private String name;
 private int ID;
public Student(String name, int ID){
    this.name=name;
    this.ID=ID;
}
public static void main(String[] args) {
        Student st1=new Student("John", 123);
        Student st2=new Student("Julia", 458);
        Student st3=new Student("Olena", 7854);
        Student st4=new Student("Veronica", 758);
        Student st5=new Student("Kseniia", 858);

        HashSet<Student> students=new HashSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        System.out.println(students);
        for(var student: students){
            System.out.println(student.name);
        }



    }
}

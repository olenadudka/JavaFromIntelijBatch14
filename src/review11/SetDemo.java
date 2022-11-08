package review11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //if we don't override equals method in our custom classes most
        // of the collections framework will not
        //work properly with this classes
        Set<Student> students = new HashSet<>(); //upcasting
        students.add(new Student("Josh", "Plantin", "123"));
        students.add(new Student("Saira", "Jawad", "133"));
        students.add(new Student("Mihan", "Calani", "1653"));
        students.add(new Student("Sonam", "Koh", "1453"));
        System.out.println(students);

        List<Student> setStudents=new ArrayList<>(students);
        System.out.println(setStudents.get(1));
    }
}

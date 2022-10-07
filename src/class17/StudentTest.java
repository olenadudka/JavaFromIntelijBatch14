package class17;

public class StudentTest {
    public static void main(String[] args) {
        Student st1=new Student("Viktor", 75, 89, 94);
        st1.printAverage();

        Student st2=new Student("Olena", 87, 90, 78);
        st2.printAverage();

        Student st3=new Student("John", 34, 97, 70);
        st3.printAverage();

        Student st4=new Student("Kate", 88, 66, 44);
        st4.printAverage();

        Student st5=new Student("Arman", 56, 57, 58);
        st5.printAverage();
    }
}

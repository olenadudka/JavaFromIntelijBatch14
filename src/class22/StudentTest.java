package class22;

public class StudentTest {
    public static void main(String[] args) {
        Student[] study={new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(Student students:study){
            students.degree();
            students.getKnowledge();
            students.study();

        }

    }
}

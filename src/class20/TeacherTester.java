package class20;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher MathTeacher=new MathTeacher("Gulcan", 18, 5);
        MathTeacher.teach();
        PianoTeacher pt=new PianoTeacher("James",25,6,"Grand");
        pt.teach();
    }
}

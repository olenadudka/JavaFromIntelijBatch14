package class22;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
    void study(){
        System.out.println("Student has to study");
    }
    void degree(){
        System.out.println("Student will get a degree");
    }
    void getKnowledge(){
        System.out.println("Every day student get a new knowledge");
    }
}

class SyntaxStudent extends Student{
    void getKnowledge(){
        System.out.println("Every day SyntaxStudent get a new knowledge");
}
    void study(){
        System.out.println("SyntaxStudent has to study hard");
    }
}
class CollegeStudent extends Student{
    void degree(){
        System.out.println("College Student will get a degree in a few years");
    }
}

class SchoolStudent extends Student{
    void getKnowledge(){
        System.out.println("Every day school student get a new knowledge");
    }
    void enterToUniversity(){
        System.out.println("After finishing school school student can enter to University");
    }

}
package class17;

public class Student {
    /*
    Write a java Class Students that have a constructor which takes students name and 3 subject grades. Inside your class
    also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
     Your program should print an average mark of each students name.
     */
    private String name;
   private  int mathGrade;
   private int englishGrade;
   private int geographyGrade;
    Student( String StName,int StMathGrade, int StEnglishGrade, int StGeographyGrade){
        name=StName;
        mathGrade=StMathGrade;
        englishGrade=StEnglishGrade;
        geographyGrade=StGeographyGrade;
    }
    void printAverage(){
       double averageGrade=(mathGrade+englishGrade+geographyGrade)/3;
        System.out.println("Student "+name+" has average grade "+averageGrade);
    }
}

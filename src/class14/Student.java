package class14;

public class Student {
    /*
    Create  class Student that will have a method getGrade. Your method should accept the score
    of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
     */
    void getGrade(int score){
        if(score>90){
            System.out.println("Your grade is A");
        }else if(score>=80){
            System.out.println("Your grade is B");
        }else if(score>=70){
            System.out.println("Your grade is C");
    }else if(score>50){
            System.out.println("Your grade is D");
}else {
            System.out.println("Your score is F");}
    }


    public static void main(String[] args) {
      Student grade=new Student();
      grade.getGrade(87);
    }}
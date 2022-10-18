package reviewClass8;

public class School {
    public static void main(String[] args) {
        Teacher t=new Teacher("John","Smith");
        System.out.println(t.name);

        Teacher t1=new Teacher("Jane","Smith","Biology");
        t1.teach();
        Teacher.school="Syntax";
        Teacher.work();
        t1.print();
        t1.teach();
       // t1.getBonus();private, is not visible
        /*
        variable syntax
        non acces modifier
         */
    }
}

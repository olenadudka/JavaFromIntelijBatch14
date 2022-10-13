package class19;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their
    // own features and behaviour. Test all 4 classes
    String name;
    int age;
    String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

   public void print(){
       System.out.println("Name is "+name+" age is "+age+ " subject is "+subject);
   }

 class MathTeacher extends Teacher {
    int id;

    MathTeacher(String name, int age, String subject, int id) {
        super(name, age, subject);
        this.id = id;
    }

    public void print1() {
        System.out.println("Name is " + name + " age is " + age + " subject is " + subject + " id is " + id);
    }

    class ChemistryTeacher extends Teacher {
        String lastName;

        ChemistryTeacher(String name, int age, String subject, String lastName) {
            super(name, age, subject);
            this.lastName = lastName;
        }

        public void print2() {
            System.out.println("Name is " + name + " last name is " + lastName + " age is " + age + " subject is " + subject);
        }

        class PianoTeacher extends Teacher {
            public PianoTeacher(String name, int age, String subject) {
                super(name, age, subject);
            }
        }}}}

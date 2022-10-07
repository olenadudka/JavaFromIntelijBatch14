package class16;

public class Students {
    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {
        Students roman=new Students();
        roman.id="1";
        roman.name="Roman";
        roman.numberOfStudent++;

        Students sonamKapor=new Students();
        sonamKapor.id="2";
        sonamKapor.numberOfStudent++;
        System.out.println( sonamKapor.numberOfStudent);

    }
}

package class21;

public class Parent {
    void getMarry(){
        System.out.println("You will marry the girl that we will select for you");
    }
}
class Zam extends Parent{
    void getMarry(){
        System.out.println("I want to marry taylor swift");
    }
}
class TestPatent{
    public static void main(String[] args) {
        Zam zam=new Zam();
        zam.getMarry();
    }
}
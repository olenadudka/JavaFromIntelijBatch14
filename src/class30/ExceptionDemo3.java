package class30;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            String name=null;
            //System.out.println(name.length()); //lne that contains issues
            System.out.println("code in the try block");
        }catch(Exception e){
            System.out.println("Backup code");
        }
        System.out.println("some important tines of code 1");
        System.out.println("some important tines of code 2");
        System.out.println("some important tines of code 3");
        System.out.println("some important tines of code 4");

        String name=null;
        // System.out.println(name.length()); //lne that contains issues
        System.out.println("some important tines of code 5");
        System.out.println("some important tines of code 6");
        System.out.println("some important tines of code 7");
        System.out.println("some important tines of code 8");
    }
}

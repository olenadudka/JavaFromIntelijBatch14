package class20;

public class HW4 {
    private void printInfo(){
        System.out.println("I don't like cakes");
    }
    private void printInfo(String favoriteCake){
        System.out.println("My favorite cake is "+favoriteCake);
    }
    private void printInfo(String favoriteCake, String favoriteCake2){
        System.out.println("My favorite cake is "+favoriteCake+" and "+favoriteCake2);
    }


    public static void main(String[] args) {
        HW4 obj=new HW4();
        obj.printInfo();
        obj.printInfo("Tiramisu");
        obj.printInfo("Tiramisu","Napoleon");
    }
}

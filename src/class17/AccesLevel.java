package class17;

public class AccesLevel {
    /*
    Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different
    package  and observe result.
     */
    private String companyName;
   private int numberEmp;
   private AccesLevel(String ThisCompanyName, int ThisNumberEmp){
       companyName =ThisCompanyName;
       numberEmp=ThisNumberEmp;
   }
   public AccesLevel(String ThisCompanyName){
       companyName =ThisCompanyName;
   }
   protected AccesLevel(int ThisNumberEmp){
        numberEmp=ThisNumberEmp;
   }
  AccesLevel() {
  }

    public static void main(String[] args) {
        AccesLevel a1=new AccesLevel("ATB", 2485)    ;
        AccesLevel a2=new AccesLevel("Brok");
        AccesLevel a3=new AccesLevel(468);
        AccesLevel a4=new AccesLevel();
    }
}

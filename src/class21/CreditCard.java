package class21;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
     Create an instance method that will calculate interest based on the given balance.
     Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
    double balance;
    double interest;
   public void getInterest(double balance, double interest){
        double calculation=balance*interest;
       System.out.println(calculation);

    }
}

class Visa extends CreditCard{

}
class AX extends CreditCard{
    @Override
    public void getInterest(double balance, double interest){
        double calculation=balance*(interest+0.05);
        System.out.println(calculation);

    }
}
package class21;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.getInterest(4000,0.15);

        Visa visa=new Visa();
        visa.getInterest(4000,0.15);

        AX ax=new AX();
        ax.getInterest(4000,0.15);
    }
}

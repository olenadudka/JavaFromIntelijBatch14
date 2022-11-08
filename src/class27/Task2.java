package class27;

import java.util.LinkedList;

public class Task2 {
    /*
    /* Create a Card class that will have iinterest rate and card type
       and a constructor that will initilize card type and interest
       Create 3 objects of different card and store them into LinkedList.
       Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {
        LinkedList<Card> cards=new LinkedList<>();
        cards.add(new Card(10,"Credit card", 2000));
        cards.add(new Card(15,"Credit card", 25000));
        cards.add(new Card(20,"Credit card", 5000));

        for(Card card:cards){
            card.printBalance();
        }
    }

}
class Card{
    double InterestRate;
    String cardType;
    double balance;

    public Card(double interestRate, String cardType, double balance) {
        InterestRate = interestRate;
        this.cardType = cardType;
        this.balance=balance;
    }
    void printBalance(){
        System.out.println(balance);
    }

    @Override
    public String toString() {
        return "Card{" +
                "InterestRate=" + InterestRate +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}

package repls;

public class repl148 {
    static class ShoppingStore{
        String item;
        double price;
        int quantity;
        ShoppingStore(String item, double price, int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }

        double itemTotalPrice(){
            double itemTotal=price*quantity;
            System.out.println(item+" total Value "+itemTotal);
            return itemTotal;
        }

    }
 class Test{

         public  void main(String[] args){
             ShoppingStore item1=new ShoppingStore("Blanket",49.99,2);
             ShoppingStore item2=new ShoppingStore("Mattress",134.79,4);
             double totalBlankets=item1.itemTotalPrice();
             double totalMatress=item2.itemTotalPrice();
             double totalAll=totalBlankets+totalMatress;
             System.out.println("You purchased "+totalAll+" Today");
         }
     }
 }

package class25;

import java.util.ArrayList;

public class IteratorDemo3 {
    public static void main(String[] args) {

        //delete all products which starts with letter B or ends with a
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");

      //Iterator<String> iterator=beautyProducts.iterator();
       var iterator =beautyProducts.iterator();  //keyword var when we don't know datatype
while(iterator.hasNext()){
    String item=iterator.next();
    //var item=iterator.next(); java 11
    if(item.startsWith("B") || item.endsWith("a")){
        iterator.remove();


    }
        }
        System.out.println(beautyProducts);
    }
}

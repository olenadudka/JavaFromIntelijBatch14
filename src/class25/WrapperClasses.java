package class25;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        //Boxing ar manual conversion from primitive to wrapper type
      int num=10;
       // Integer wrappedNum=Integer.valueOf(num);
      //  System.out.println(wrappedNum);
        //autoboxing or automatic conversion of a primitive to a wrapper type
        Integer wrappedNum=num;
        System.out.println(wrappedNum);
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);

        //unboxing converting a wrapper type to a corresponding primitive type
        //auto unboxing or automatic conversion of a wrapper type to a primitive type
        int num2=wrappedNum;
    }
}

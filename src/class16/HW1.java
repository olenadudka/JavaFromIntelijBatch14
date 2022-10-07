package class16;

public class HW1 {
    /*
    Create a method that will accept an array as parameters and will
    return a sum of all elements from that array. Method should be visibly only
    within same package and accessible by the creating an instance of the class.
     */
    int sumNum(int[] numbers){
        int sum=0;
        for(int i=0; i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        HW1 addition=new HW1();
        int[] numbers={5,45,85,6,45};
        System.out.println(addition.sumNum(numbers));
    }


}

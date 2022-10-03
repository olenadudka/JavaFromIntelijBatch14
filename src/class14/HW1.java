package class14;

public class HW1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void largest(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " larger ");
        } else {
            System.out.println(num2 + " is larger");
        }

    }

    public static void main(String[] args) {
HW1 obj=new HW1();
obj.largest(15,78);
    }

}
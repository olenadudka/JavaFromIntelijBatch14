package class14;

public class Prime {
    //Write a method to return whether given number is prime or not?
    String method(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return "Not prime";
                } else {
                    return "Prime";
                }


            }


        }

        return null;
    }

    public static void main(String[] args) {
        Prime input=new Prime();
        System.out.println(input.method(8));

    }
}

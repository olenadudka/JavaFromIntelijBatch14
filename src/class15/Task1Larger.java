package class15;


import java.util.Scanner;

public class Task1Larger {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    void larger(int x, int y) {
        int largest;
        if (x > y) {
            largest = x;
        } else {
            largest = y;
        }
        System.out.println(largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("pls enter the first number");
        int num = scanner.nextInt();
        System.out.println("pls enter the second number");
        int num1 = scanner.nextInt();
        Task1Larger obj = new Task1Larger();
        obj.larger(num, num1);

    }
}

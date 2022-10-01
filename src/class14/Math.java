package class14;

public class Math {
    void add(int num1, int num2){
        System.out.println(num1+num2);
    }
    void printFiboSeries(int size){
        int previous=0;
        int curentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(curentNumber);
        for(int i=0; i<size;i++){
            nextNum=previous+curentNumber;
            System.out.println(nextNum);
            previous=curentNumber;
            curentNumber=nextNum;

        }
    }

    public static void main(String[] args) {
        Math obj=new Math(); //creating an object of the math Class
        obj.printFiboSeries(5);
        obj.printFiboSeries(8); //this is how we execute the logic present inside the methods
        System.out.println("*********************");
        obj.add(10,20);
    }
}

package class15;

public class LocalVarDemo {
    String name; //instance variable
    public static void main(String[] args) {
        int number=0;  //local variable
        /*
        local variables are defined inside block of code and can only be used inside those blocks
         */
        //sout(name);
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
    }
    void printNumber(){
        int number=4;
        String name="Allan";
    }

}

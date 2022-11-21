package class30;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{
            doSomething();
        }catch(NullPointerException npe){
            System.out.println("get null pointer exception");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("got index out of bound this time");
        }
        catch(NegativeArraySizeException e){
            System.out.println("we can't create array with negative size");
        }
        catch(Exception e){
            System.out.println("I can handle any type of exceptions");
        }
    }
    public static void doSomething(){
       /* String name=null;
        System.out.println(name.length());*/
       /* int arr[]=new int[1];
        System.out.println(arr[10]);*/
        /*String str="hhgkh";
        str.charAt(20);*/
        System.out.println(101/0);
    }
}

package class30;

import utils.ExcelReader;

import java.io.IOException;

public class TypesOfExceptions {
    public static void main(String[] args) {
        String name=null;
        if(name!=null){
        System.out.println(name.length());}

        int[] arr=new int[5];
        int index=10;
        try{
        System.out.println(arr[index]);
    }catch(Exception e){
            System.out.println("Please fix your issure");}

        if(index<arr.length){
            System.out.println(arr[index]);
        }

            try {
                System.out.println( ExcelReader.read("Data/Test1.xlsx"));
            } catch (IOException e) {
            System.out.println("stop deleting my files");
            }catch(NullPointerException e){}
        System.out.println("important line of code");
    }
}

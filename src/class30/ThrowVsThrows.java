package class30;

import utils.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {
    public static void main(String[] args)  {
        method2();
    }
       public static void method1()  {
           try {
               System.out.println(ExcelReader.read("Data/Test1.xlsx"));
           } catch (IOException e) {

           }
       }
    public static void method2()  {
        method1();
    }
}


package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        right click on your file and click copy path reference than click Content root
         */
        String path="Data/config.properties"; //location of the file
       var fileInputStream=new FileInputStream(path); //it helps us to navigate to the file
        var properties=new Properties();//that spesial software that helps us to reAD data from file
        properties.load(fileInputStream);//loads all data from the file inside(Memory
        System.out.println(properties.getProperty("URL"));
fileInputStream.close(); //close the file

    }
}

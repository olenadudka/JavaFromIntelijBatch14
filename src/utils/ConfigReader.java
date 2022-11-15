package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties read (String path) throws IOException {
    var fileInputStream=new FileInputStream(path); //it helps us to navigate to the file
    var properties=new Properties();//that spesial software that helps us to reAD data from file
        properties.load(fileInputStream);//loads all data from the file inside(Memory
        return properties;

}}

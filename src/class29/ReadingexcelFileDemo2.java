package class29;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingexcelFileDemo2 {


        public static void main(String[] args) throws IOException {

            var excelData=   ExcelReader.read("Data/Test1.xlsx");
            System.out.println(excelData);

        }
    }


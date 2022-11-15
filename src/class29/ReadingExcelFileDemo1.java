package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcelFileDemo1 {
    public static void main(String[] args) throws IOException {

        //location of the file on your HardDrive where file is stored
        String path="Data/Test1.xlsx";
        //reads the data from HardDrive brings it to RAM in the row form 10001010
        //in simple words we can say computer has navigated to that file
        FileInputStream fis=new FileInputStream(path);
     //this class converts the row bytes to Excel format or it is that special software
        //that helps us read and write data to an Excel file
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        Sheet sheet=excel.getSheet(("Sheet1"));
        int noOfRow= sheet.getPhysicalNumberOfRows();
        for (int i = 0; i <noOfRow ; i++) {
            Row row= sheet.getRow(i);
           // System.out.println(row); //get a row from sheet one by one through loop
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfCells ; j++) {
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }


    }
}

package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ExcelDemo2 {
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
        //getting the first row we can use it as a key
        Row headerRow=sheet.getRow(0);
        //the Map that will store the data foreach row
       //
        ArrayList<LinkedHashMap<String,String>> excelDada=new ArrayList<>();//a list that cn hold maps
        //a loop that goes through all the rows that contain the data
        for (int rowNo = 1; rowNo <noOfRow ; rowNo++) {
            LinkedHashMap<String,String> rowMap=new LinkedHashMap();
            //get a data row from sheet one by one through loop
            Row dataRow= sheet.getRow(rowNo);
//getting the count of how many cells contains the data
            int noOfCells=dataRow.getPhysicalNumberOfCells();
            //a loop to go through all the cells
            for (int cellNo = 0; cellNo<noOfCells ;cellNo++) {

                //getting key from header row and values from data rows
                String key=headerRow.getCell(cellNo).toString();
                String value=dataRow.getCell(cellNo).toString();
               rowMap.put(key, value);
            }
            excelDada.add(rowMap);
           // System.out.println(rowMap);

        }
        System.out.println(excelDada);
    }
}

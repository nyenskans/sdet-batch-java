package com.syntax.class031;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelFileReading2 {

    // when we build our framework we can literally copy this entire code

    public static void main(String[] args) throws IOException {
        String path="/Users/katarinasusic/IdeaProjects/SDET Batch/Files/File1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        // we will store the data of cells in a map and store those maps in a list:
        // List has maps-->rows (--> pairs of keys and values)
        List<Map<String, String>> excelData= new ArrayList<>();
        // this map will hold the data for rows:
        HashMap<String,String> rowData;

        // (contains all the KEYS we will use, in a map)
        // we get the header row first because those are the keys which always stay the same:
        Row headerRow = sheet.getRow(0);
        // we get the number of rows:
        int numOfRows = sheet.getPhysicalNumberOfRows();

  //   The outer loop goes through all the rows:
         for(int i=1; i<numOfRows; i++){ // starts from 1 because 0 is header row
             Row dataRow = sheet.getRow(i);
             // now we create a new map that will be the final map where we get the required value+key pairs:
             // each data row creates its own map
             rowData=new HashMap<>();
             // now we get number of cells:
             int numOfCells = dataRow.getPhysicalNumberOfCells();

             for(int j=0; j<numOfCells; j++){
                // the inner loop gets all data from all cells
                 String key= headerRow.getCell(j).toString(); // this is how we get the value from header row for keys
                                                            // if we don't do .toString(), error: Required type:String, Provided:Cell
                 String value=dataRow.getCell(j).toString(); // this is how we get the value from data row for values
                 // we add the elements from headerRow and dataRow as pairs into the map we initialized in line 37
                 rowData.put(key, value);
                }
             // List of maps we initialized in line 23: complete data from the excel file:
            excelData.add(rowData) ;
         }
        System.out.println(excelData);

        //  output are 2 maps of key+value for each row (for each person/each entry)
        fileInputStream.close();


        // debugger mode: run to cursor option in console to skip to a certain line of code to debug
    }
}

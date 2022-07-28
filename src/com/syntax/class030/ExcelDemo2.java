package com.syntax.class030;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo2 {
    public static void main(String[] args) throws IOException {
        // 1. locate the file
        String path="/Users/katarinasusic/Desktop/File1.xlsx";
        // 2. navigate to location of the file, pass path as parameter
        FileInputStream fileInputStream = new FileInputStream(path);
        // 3. class that understands how excel files work --? xssfworkbook; pass fileInputStream as parameter
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        //  get the sheet we want to work with
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        // HOW TO READ ALL DATA FROM AN EXCEL FILE:

        // we can only do it one sheet at a time
        // to be able to read all of it, we need to know how many rows there are in the sheet, and we use the following method:
        int noOfRows=sheet.getPhysicalNumberOfRows();

        System.out.println(noOfRows);

        // we have to write a nested for loop:
        for(int i=0; i<noOfRows;i++){
            Row row = sheet.getRow(i); // we always have to get the rows first using the above method
            int noOfCells=row.getPhysicalNumberOfCells();  //then the number of cells using the same method on rows
            for(int j=0; j<noOfCells;j++){
                Cell cell = row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }



    }
}

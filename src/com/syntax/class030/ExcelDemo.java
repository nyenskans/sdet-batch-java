package com.syntax.class030;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDemo {
    public static void main(String[] args) throws IOException {
        // 1. locate the file
        String path="/Users/katarinasusic/Desktop/File1.xlsx";
        // 2. navigate to location of the file, pass path as parameter
        FileInputStream fileInputStream = new FileInputStream(path);
        // 3. class that understands how excel files work --? xssfworkbook; pass fileInputStream as parameter
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        // rows start from 0
        // columns (cells) start from 0
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(0);
        System.out.println(cell);
      //  System.out.println( row+" "+cell); error--> we cannot print the row
      //
        Cell cell1=row.getCell(1);

        // I get a correct output but also this :
        // "ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console..."
        // that is fine and can be ignored


    }
}

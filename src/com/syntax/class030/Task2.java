package com.syntax.class030;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task2 {
    /*
    How to create excel files using apache poi and java
     */
    public static void main(String[] args) throws IOException {
        // 1. define path where we want to create the file and it's name with extension xlsx
        String path="/Users/katarinasusic/Desktop/DemoExelFileCreate.xlsx/";
        // 2. navigate to location of the file, pass path as parameter
        // use FileOutputStream because we are creating a file
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        // 3. add class that can work with excel files
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        // 4. create a sheet
        Sheet sheet =  xssfWorkbook.createSheet("SheetNo1");
        // 5. create a row
        Row row=sheet.createRow(0);
        // 6. create a cell
        Cell cell=row.createCell(0);
        // 7. add value to the cell
        cell.setCellValue("Katarina");
        // 8. create the file
        xssfWorkbook.write(fileOutputStream);
        // 9. close the file
        fileOutputStream.close();

    }
}

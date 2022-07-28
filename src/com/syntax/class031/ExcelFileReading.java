package com.syntax.class031;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileReading {
    public static void main(String[] args) throws IOException {
        String path="/Users/katarinasusic/IdeaProjects/SDET Batch/Files/File1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

//        Row row = sheet.getRow(0);
//        Cell cell= row.getCell(1);

      int numOfRows = sheet.getPhysicalNumberOfRows();
        for(int i=0; i<numOfRows; i++){
            // the outer loop
            Row row = sheet.getRow(i);
            int numOfCells = row.getPhysicalNumberOfCells();
            for(int j=0; j<numOfCells; j++){
                System.out.print(row.getCell(j)+" ");
            }
            System.out.println();
        }

        // in practice, we won't be just printing the values, instead we will store it to be used later
        fileInputStream.close();

    }
}

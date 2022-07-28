package com.syntax.class031;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelReaderTest {
    // from package utils ExcelReader class
    public static void main(String[] args) throws IOException {
                                             //// from package utils ExcelReader class
        List<Map<String, String>> excelData = ExcelReader.readExcelFile(Constants.ExcelFilePath);
        for(Map<String, String> row:excelData){
            for(Map.Entry<String, String> entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }


    }
}

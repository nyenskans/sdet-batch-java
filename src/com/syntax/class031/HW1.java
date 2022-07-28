package com.syntax.class031;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class HW1 {
    //Create a property file to store following configurations:
    //browser=chrome
    //url=https://facebook.com
    //username
    //password
    // read file and extract value of browser and
    public static void main(String[] args) throws IOException {

            // 1. path and name with extension
            String path="/Users/katarinasusic/IdeaProjects/SDET Batch/Files/FileTask1.properties";
            // 2. navigate to the location
            FileInputStream fileInputStream= new FileInputStream(path);
            // 3. add Properties class
            Properties properties = new Properties();
            // 4. get values for given configurations
            System.out.println(properties.getProperty("browser"));
            System.out.println(properties.getProperty("url"));
            // 5. loading the data from the file inside the properties Object
            properties.load(fileInputStream); //Reads a property list (key and element pairs) from the input byte stream.
            // 6. close
            fileInputStream.close();

        }
}

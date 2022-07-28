package com.syntax.class030;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
        //Create a property file to store following configurations:
        //browser=chrome
        //url=https://facebook.com
        //username
        //password
    public static void main(String[] args) throws IOException {
        // 1. path and name with extension
      String path="/Users/katarinasusic/IdeaProjects/SDET Batch/Files/FileTask1.properties";
      // 2. navigate to the location
        FileOutputStream fileOutputStream= new FileOutputStream(path);
        // 3. add Properties class
        Properties properties = new Properties();
        // 4. set values for given configurations
        properties.setProperty("browser","chrome");
        properties.setProperty("url","https://facebook.com");
        properties.setProperty("username","lokac123");
        properties.setProperty("password","lokismoki");
        // 5. store the data in the form of a file on our hard drive and add a comment
        properties.store(fileOutputStream, "A new property has been created");
        // 6. close
        fileOutputStream.close();

    }
}

package com.syntax.class030;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesCreateFileDemo {
    public static void main(String[] args) throws IOException {
        // 1. path where we want to create the file
        String path="/Users/katarinasusic/IdeaProjects/SDET Batch/Files/NewFile.properties";
        // 2. navigate to location of the file, pass path as parameter
        // use FileOutputStream because we are creating a file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        // 3. create properties object to be able to write in the file
        Properties properties=new Properties();
        // 4. we use method setProperty to store key-value pair inside the object
        properties.setProperty("Sunny", "true");
        // 5. store the data in the form of a file on our hard drive and add a comment
        properties.store(fileOutputStream, "A new property has been created");
        // 6. close the file
        fileOutputStream.close();
    }
}

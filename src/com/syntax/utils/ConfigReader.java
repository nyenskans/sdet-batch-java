package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // we create a method to read properties from a Properties file with the path of the file as parameter
    public static Properties readConfig(String path) throws IOException {
        // navigate to that location
        FileInputStream fileInputStream = new FileInputStream(path);
        // Properties class that handles the .properties files
        Properties properties=new Properties();
        // .load() method  loads the data:
        properties.load(fileInputStream);
        return properties;

    }
}

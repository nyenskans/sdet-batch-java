package com.syntax.class029part2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {

        // This demo shows how to read Properties file

        // Steps to read a file:
        // 1. we need to know the path/location of the file
        String path="Files/config.properties";
        // 2. Navigating to the path where the file is stored
        FileInputStream fileInputStream=new FileInputStream(path);
        // 3. we need special software that understands that file, that we can use to open and edit it
        Properties properties=new Properties();
        // 4. loading all the data from the file inside the properties objects
        properties.load(fileInputStream);

        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        fileInputStream.close();

    }
}

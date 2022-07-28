package com.syntax.class031;

import com.syntax.utils.ConfigReader;
import com.syntax.utils.Constants;

import java.io.IOException;
import java.util.Properties;

public class ConfigReaderTest {
    public static void main(String[] args) throws IOException {
        // we call our .read() method that reads the data from class Constants (path ConfigReaderPath)
        Properties properties = ConfigReader.readConfig(Constants.ConfigReaderPath);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
    }


}

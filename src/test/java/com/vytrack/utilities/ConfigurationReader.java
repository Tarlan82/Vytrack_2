package com.vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

     //1 Create the object of Properties
     private static Properties properties = new Properties();

     static {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            file.close();

        } catch (IOException e) {
            System.out.println("no such a file");
            e.printStackTrace();
        }

    }

    /*
    public static String getProperty(String keyword){
        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties.getProperty(keyword);
    }

*/

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }


}

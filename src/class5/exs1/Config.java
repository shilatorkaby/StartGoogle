package class5.exs1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
// files type , reading way
public class Config {

    protected void main(String[] args) {
        Properties prop = new Properties();
        String fileName = "C:\\javaProjects\\startGoogle\\src\\class5\\exs1\\data.config";
        try (FileInputStream input = new FileInputStream(fileName)) {
            prop.load(input);

        if(input==null | prop.isEmpty()) {
            throw new IllegalArgumentException("File not initialize".toString());
        }

        Map<String, String> data=new HashMap<String,String>();

        Enumeration<Object> keys = prop.keys();
        Enumeration<Object> values = prop.elements();

        while (keys.hasMoreElements() && values.hasMoreElements()) {
            data.put(keys.nextElement().toString(), values.nextElement().toString());
        }


        for (Map.Entry<String, String> entry : data.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        }
        if(prop.getProperty("hi")==null)
        {
            System.out.println("\nKey hi doesn't exist".toString()); // For good running
            //throw new IllegalArgumentException("Key hi doesn't exist".toString());
        }

    }

        catch (FileNotFoundException ex) {
            System.out.println("No file found");
            File file = new File("file.config");

        }
        catch (IOException ex) {
            System.out.println("Invalid value");
        }

    }

}

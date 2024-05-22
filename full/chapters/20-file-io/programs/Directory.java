import java.io.*;
import java.text.*;
import java.util.*;

public class Directory {    
    public static void main(String[] args) {
        File directory = new File(".");			//<.>
        File[] files = directory.listFiles();	//<.>
        for(File file: files) {
            System.out.print(DateFormat.getDateInstance().format(
                new Date(file.lastModified())) + "\t");	//<.>
            if(file.isDirectory())						//<.>
                System.out.print("directory");			
            else
                System.out.print("\t");
            System.out.println("\t" +  file.getName());	//<.>
        }               
    }
}

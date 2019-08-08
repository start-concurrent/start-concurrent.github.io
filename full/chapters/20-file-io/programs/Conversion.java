import java.io.*;
import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        File inFile = new File("radiuses.txt");
        File outFile = new File("radiuses.bin");
        Scanner in = null;
        DataOutputStream out = null;        
        try {
            in = new Scanner(inFile);
            out = new DataOutputStream(new FileOutputStream(outFile));           
            while(in.hasNextDouble())
                out.writeDouble(in.nextDouble());
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        finally { 
            if(in != null) in.close();
            try { out.close(); } catch(Exception e){}
        }
    }
}
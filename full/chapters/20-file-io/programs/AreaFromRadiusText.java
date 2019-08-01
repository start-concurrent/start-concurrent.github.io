import java.io.*;
import java.util.*;

public class AreaFromRadiusText {
    public static void main(String[] args) {
        File inFile = new File("radiuses.txt");
        File outFile = new File("areas.txt");
        Scanner in = null;
        PrintWriter out = null;     
        double radius;
        try {
            in = new Scanner(inFile);
            out = new PrintWriter(outFile);           
            while(in.hasNextDouble()) {
                radius = in.nextDouble();
                out.println(Math.PI*radius*radius);
            }
        }
        catch(Exception e) { 
            System.out.println(e.getMessage());
        }
        finally { 
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}
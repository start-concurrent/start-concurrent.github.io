import java.io.*;
import java.util.*;

public class AreaFromRadiusText {
    public static void main(String[] args) {
        File inFile = new File("radiuses.txt");
        File outFile = new File("areas.txt");
        Scanner in = null;
        PrintWriter out = null;     
        try {
            in = new Scanner(inFile);		//<.>
            out = new PrintWriter(outFile);	//<.>
            while(in.hasNextDouble()) {		//<.>
                double radius = in.nextDouble();				//<.>
                out.format("%.3f%n", Math.PI*radius*radius);	//<.>
            }
        }
        catch(FileNotFoundException e) { 	//<.>
            System.out.println(e.getMessage());
        }
        finally { 							//<.>
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}

import java.io.*;

public class AreaFromRadiusBinary {
    public static void main(String[] args) {
        File inFile = new File("radiuses.bin");
        File outFile = new File("areas.bin");
        DataInputStream in = null;
        DataOutputStream out = null;        
        try {
            in = new DataInputStream(new FileInputStream(inFile));		//<.>
            out = new DataOutputStream(new FileOutputStream(outFile));	//<.>
            while(true) {	//<.>
                double radius = in.readDouble();
                out.writeDouble(Math.PI*radius*radius);              
            }           
        }
		catch(EOFException e) {} // End of file reached <.>
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        finally { 
            try { in.close(); } catch(Exception e){}
            try { out.close(); } catch(Exception e){}
        }
    }
}

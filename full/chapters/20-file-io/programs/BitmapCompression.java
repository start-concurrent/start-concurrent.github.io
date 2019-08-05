import java.io.*;

public class BitmapCompression {
    public static void main(String[] args) {
        FileInputStream in = null;
        try {           
            in = new FileInputStream(args[1]);
            if(args[0].equals("-c"))
                compress(in, args[1]);
            else if(args[0].equals("-d"))
                decompress(in, args[1]);          
        }
        catch(Exception e) { 
            System.out.println("Bad input: " + e.getMessage());
        }
        finally { try{ in.close(); } catch(Exception e){} }
    }
    
    public static void compress(FileInputStream in, String file) {
        int temp, count = 1;
        FileOutputStream out = null;
        try {           
            out = new FileOutputStream(file + ".compress");       
            int current = in.read();        
            while((temp = in.read()) != -1) {         
                if(temp == current && count < 127)
                    count++;
                else {
                    out.write(count);
                    out.write(current);               
                    count = 1;
                    current = temp;
                }
            }
			// Last sequences of bytes
			out.write(count);
            out.write(current);
        }
        catch(Exception e) {
			System.out.println("Compression failed: " + e.getMessage());
        }
        finally { try { out.close(); } catch(Exception e){} }
    }
    
    public static void decompress(FileInputStream in, String file) {
        int count;        
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(file.substring(0, file.lastIndexOf(".compress")));
            while((count = in.read()) != -1) {            
                int temp = in.read();           
                for(int i = 0; i < count; i++)
                    out.write(temp);                          
            }
        }
        catch(Exception e) {
			System.out.println("Decompression failed: " + e.getMessage());
        }               
        finally { try{ out.close(); } catch(Exception e){} }
    }
}
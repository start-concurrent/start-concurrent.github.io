import java.io.*;

public class ConcurrentFileAccess implements Runnable {
    private boolean even;
    
    public static void main(String args[]) {
        Thread writer1 = new Thread(new ConcurrentFileAccess(true)); //<.>
        Thread writer2 = new Thread(new ConcurrentFileAccess(false));     
        writer1.start(); //<.>
        writer2.start();
    }
    
    public ConcurrentFileAccess(boolean even) {
        this.even = even;
    }
    
    public void run() {
        PrintWriter out = null;
        int start = even ? 0 : 1; //<.>
        try {
			out = new PrintWriter(new File("concurrent.out")); //<.>
            for(int i = start; i < 10000; i += 2) //<.>
                out.println(i);				
        }
        catch (FileNotFoundException e) {
            System.out.println("concurrent.out not found!");
        }
        finally { if(out != null) out.close(); } //<.>
    }   
}
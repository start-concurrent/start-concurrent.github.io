import java.io.*;

public class ConcurrentFileAccess implements Runnable {
	private boolean even;
	
	public static void main(String args[]) {
		Thread writer1 =
			new Thread( new ConcurrentFileAccess(true) );
		Thread writer2 =
			new Thread( new ConcurrentFileAccess(false) );		
		writer1.start();
		writer2.start();
	}
	
	public ConcurrentFileAccess( boolean even ) {
		this.even = even;
	}
	
	public void run() {
		PrintWriter out = null;
		int start = 0;
		if( !even )
			start = 1;		
		try {
			out = new PrintWriter (
					new FileOutputStream ( "concurrent.out", true ) ); /*@\label{open concurrent file}@*/
			for( int i = start; i < 10000; i += 2 ) {
				out.println ( i ); /*@\label{output data concurrently}@*/
				out.flush();
			}
				
		}
		catch ( FileNotFoundException e ) {
			System.out.println("concurrent.out not found!");
		}
		finally { if( out != null ) out.close (); }	
	}	
}
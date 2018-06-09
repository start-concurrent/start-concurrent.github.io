import java.io.*;

public class BitmapCompression {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		try {			
			in = new ObjectInputStream(new FileInputStream(args[1]));
			if( args[0].equals("-c"))
				compress( in, args[1] );
			else if( args[0].equals("-d"))
				decompress( in, args[1] );			
		}
		catch( Exception e ) { 
			System.out.println("Bad input: " + e.getMessage() );
		}
		finally { try{ in.close(); } catch( Exception e ){} }
	}
	
	public static void compress( ObjectInputStream in,
		String file ) {
		int temp, current, count = 1;
		ObjectOutputStream out = null;
		try {			
			out = new ObjectOutputStream( 
				new FileOutputStream( file + ".compress" ) );		
			current = in.read();		
			while( (temp = in.read()) != -1 ) {			
				if( temp == current && count < 127 )
					count++;
				else {
					out.writeByte( count );
					out.writeByte( current );				
					count = 1;
					current = temp;
				}
			out.write( count );
			out.write( current );
			}
		}
		catch( Exception e ) {
			System.out.println("Compression failed: "
				+ e.getMessage() );
		}
		finally { try { out.close(); }catch(Exception e){} }
	}
	
	public static void decompress( ObjectInputStream in,
		String file ) {
		int count, temp;		
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream( 
				new FileOutputStream( file.substring( 0,
					file.lastIndexOf(".compress")) ));
			while( (count = in.read()) != -1 ) {			
				temp = in.readByte();			
				for( int i = 0; i < count; i++ )
					out.writeByte( temp );							
			}
		}
		catch( Exception e ) {
			System.out.println("Decompression failed: "
				+ e.getMessage() );
		}				
		finally { try{ out.close(); } catch(Exception e){} }
	}
}
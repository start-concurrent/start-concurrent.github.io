import java.io.*;

public class AreaFromRadiusBinary {
    public static void main(String[] args) {
        File inFile = new File( "radiuses.bin" );
        File outFile = new File( "areas.bin" );
        ObjectInputStream in = null;
        ObjectOutputStream out = null;
        double radius;
        try {
            in = new ObjectInputStream( 
                new FileInputStream( inFile ));
            out = new ObjectOutputStream( 
                new FileOutputStream( outFile ));           
            while( true ) {
                radius = in.readDouble();
                out.writeDouble(  Math.PI*radius*radius );              
            }           
        }
        catch( EOFException e ) {}
        catch(Exception e) {
            System.out.println( e.getMessage() );
        }
        finally { 
            try { in.close(); } catch( Exception e ){}
            try { out.close(); } catch( Exception e ){}
        }
    }
}
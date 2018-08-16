import java.io.*;
import java.net.*;
import java.util.*;
public class Chat {
    private Socket socket;
    
    public static void main(String[] args) {        
        if( args[0].equals("-s") )
            new Chat( Integer.parseInt( args[1] ) );
        else if( args[0].equals("-c") )
            new Chat( args[1], Integer.parseInt( args[2] )  );
        else
            System.out.println("Invalid command line flag.");
    }
    
    // Server
    public Chat( int port ) {
        try {
            ServerSocket serverSocket = new ServerSocket( port );   
            socket = serverSocket.accept();
            runChat();
        }
        catch( Exception e ) {}         
    }
    
    // Client
    public Chat( String address, int port ) {
        try {               
            socket = new Socket( address, port );
            runChat();                  
        }
        catch( Exception e )
        {}          
    }
    
    public void runChat() throws InterruptedException {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        sender.start();
        receiver.start();           
        sender.join();
        receiver.join();
    }

    private class Sender extends Thread {
        public void run() { 
            try {
                PrintWriter netOut = new PrintWriter( 
                    socket.getOutputStream() );
                Scanner in = new Scanner( System.in );      
                System.out.print("Enter your name: ");
                String name = in.nextLine();        
                String buffer = "";
                while( !socket.isClosed() ) {
                    if( in.hasNextLine() ) {
                        buffer = in.nextLine(); 
                        if( buffer.equals("quit") )
                            socket.close();
                        else {
                            netOut.println( name + ": "
                                + buffer );
                            netOut.flush();
                        }
                    }           
                }       
            }
            catch( IOException e ) {}           
        }       
    }   

    private class Receiver extends Thread {
        public void run() {
            try{
                Scanner netIn = new Scanner(
                    socket.getInputStream()) ;
                while( !socket.isClosed() )                 
                    if( netIn.hasNextLine() )
                        System.out.println( netIn.nextLine() );
            }
            catch( IOException e ) {}           
        }
    }
}
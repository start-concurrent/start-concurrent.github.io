import java.io.*;	//<.>
import java.net.*;
import java.util.*;

public class Chat {
    private Socket socket;
    
    public static void main(String[] args) {        
        if(args[0].equals("-s")) 		//<.>
            new Chat(Integer.parseInt(args[1]));
        else if(args[0].equals("-c"))	//<.>
            new Chat(args[1], Integer.parseInt(args[2]) );
        else
            System.out.println("Invalid command line flag.");
    }
    
    // Server
    public Chat(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port); //<.>
            socket = serverSocket.accept();
            runChat();	//<.>
        }
        catch(IOException e) {
			System.out.println("Network error: " + e.getMessage());		
		}         
    }
    
    // Client
    public Chat(String address, int port) { 
		try {	
			socket = new Socket(address, port);
			runChat();
		}
        catch(IOException e) {
			System.out.println("Network error: " + e.getMessage());		
		} 			
    }
    
    public void runChat() {
        Sender sender = new Sender();		//<.>
        Receiver receiver = new Receiver();
        sender.start();						//<.>
        receiver.start();
		try {
			sender.join();
			receiver.join();
		}
		catch(InterruptedException e) {}
    }

    private class Sender extends Thread {
        public void run() { 
            try {
                PrintWriter netOut = new PrintWriter(socket.getOutputStream()); //<.>
                Scanner in = new Scanner(System.in);      
                System.out.print("Enter your name: ");
                String name = in.nextLine();				//<.>
                while(!socket.isClosed()) {                  
					String line = in.nextLine(); 			//<.>
					if(line.equals("quit"))					//<.>
						socket.close();
					else {
						netOut.println(name + ": " + line); //<.>
						netOut.flush();
					}                               
                }       
            }
            catch(IOException e) {
				System.out.println("Network error: " + e.getMessage());				
			}         
        }       
    }   

    private class Receiver extends Thread {
        public void run() {
            try{
                Scanner netIn = new Scanner(socket.getInputStream()); 	//<.>
                while(!socket.isClosed())                 
                    if(netIn.hasNextLine())
                        System.out.println(netIn.nextLine());			//<.>
            }
            catch(IOException e) {
				System.out.println("Network error: " + e.getMessage());	
			}           
        }
    }
}

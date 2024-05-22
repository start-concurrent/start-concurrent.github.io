import java.io.*;			//<.>
import java.net.*;
import java.util.*;

public class WebServer {        
    private int port;		//<.>
    private String webRoot;   
    
    public WebServer(int port, String webRoot) {
        this.port = port;
        this.webRoot = webRoot;
    }
    
    public static void main(String[] args) {
		WebServer server = new WebServer(80, new File(".").getAbsolutePath()); //<.>
        server.start();
    }
    
    public void start() {
        Socket socket = null;
        Scanner in = null;
        DataOutputStream out = null;
        String line;
        try {
            ServerSocket serverSocket = new ServerSocket(port); //<.>
            while(true) {
                socket = serverSocket.accept(); 
                try {               
                    in = new Scanner(socket.getInputStream()) ;	//<.>
                    out = new DataOutputStream(socket.getOutputStream());
					boolean requestRead = false;
                    while(in.hasNextLine() && !requestRead) {	//<.>
                        line = in.nextLine();
                        if(line.startsWith("GET")) {
                            String path = line.substring(4,		//<.>
								line.lastIndexOf("HTTP")).trim();
                            System.out.println("Received request for: " + path);
                            serve(out, getPath(path));			//<.>
                            socket.close();						//<.>
                            requestRead = true;
                        }
                    }
                }
                catch(IOException e) {							//<.>
                    System.out.println("Error: " + e.getMessage());
                }              
            }
        }
        catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   

    public String getPath(String path) {
        if('/' != File.separatorChar)				//<.>
            path = path.replace('/', File.separatorChar);       
        if(path.endsWith("" + File.separatorChar))
            return webRoot + path + "index.html";	//<.>
        else
            return webRoot + path;      
    }
    
    public void serve(DataOutputStream out, String path) throws IOException {
        System.out.println("Trying to serve " + path);
        File file = new File(path);
        if(!file.exists()) {						//<.>
            out.writeBytes("HTTP/1.1 404 Not Found\n\n");
            out.writeBytes("<html><head><title>404 Not Found</title></head>" +
				"<body><h1>Not Found</h1>The requested URL " + path +
				" was not found on this server.</body></html>");
            System.out.println("File not found.");
        }
        else {
            out.writeBytes("HTTP/1.1 200 OK\n\n");	//<.>
            DataInputStream in = null;
            try {
                in = new DataInputStream(new FileInputStream(file)); //<.>
                while(true)
                    out.writeByte(in.readByte());	//<.>
            }
			catch(EOFException e) {
				System.out.println("Request succeeded.");
			}
            catch (IOException e) {
                System.out.println("Error sending file: " + e.getMessage());
            }
            finally { try{ in.close(); } catch(Exception e) {} } //<.>
        }
    }
}   

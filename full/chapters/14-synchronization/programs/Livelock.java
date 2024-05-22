public class Livelock extends Thread {
    private static int totalReady = 0; 		   //<.>
    private static Object lock = new Object(); //<.>

    public static void main(String[] args) {   //<.>
        Livelock friend1 = new Livelock();
        Livelock friend2 = new Livelock();
        Livelock friend3 = new Livelock();
        
        try {       
            friend1.start();
            Thread.sleep(100);
            friend2.start();
            Thread.sleep(100);
            friend3.start();
                        
            friend1.join();
            friend2.join();
            friend3.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }       
        System.out.println("All ready!");
    }

    public void run() { 
        boolean done = false;
    
        try {       
            while(!done) { //<.>
                Thread.sleep(75); // Prepare for party <.>
                synchronized(lock) {
                    totalReady++;       //<.>
                }                   
                Thread.sleep(75); // Wait for friends  <.>
                synchronized(lock) {
                    if(totalReady >= 3) //<.>
                        done = true;
                    else
                        totalReady--;   //<.>
                }
            }
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

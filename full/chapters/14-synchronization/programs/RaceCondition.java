public class RaceCondition extends Thread {     
    private static int counter = 0; 
    public static final int THREADS = 4;    
    public static final int COUNT = 1000000;        
    
    public static void main(String[] args) {                              
        RaceCondition[] threads = new RaceCondition[THREADS];           
        for(int i = 0; i < THREADS; i++) {
            threads[i] = new RaceCondition();
            threads[i].start();         
        }           
        try {
            for(int i = 0; i < THREADS; i++)
                threads[i].join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }           
        System.out.println("Counter:\t" + counter);            
    }   
    
    public void run() { 
        for(int i = 0; i < COUNT/THREADS; i++)
            counter++;
    }
}

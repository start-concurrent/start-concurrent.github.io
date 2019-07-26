import java.util.concurrent.atomic.*;

public class NoRaceCondition extends Thread {       
    private static AtomicInteger counter = new AtomicInteger(); 
    public static final int THREADS = 4;    
    public static final int COUNT = 1000000;        
    
    public static void main(String[] args) {                              
        NoRaceCondition[] threads = new NoRaceCondition[THREADS];           
        for(int i = 0; i < THREADS; i++) {
            threads[i] = new NoRaceCondition();
            threads[i].start();         
        }           
        try {
            for(int i = 0; i < THREADS; i++)
                threads[i].join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }           
        System.out.println("Counter:\t" + counter.get());          
    }   
    
    public void run() { 
        for(int i = 0; i < COUNT / THREADS; i++)
            counter.incrementAndGet();
    }
}

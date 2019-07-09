import java.util.Random;

public class DeadlockSum extends Thread {
    private static Random random1 = new Random();
    private static Random random2 = new Random();   
    private boolean reverse;
    private int sum;

    public static void main(String[] args) {
        Thread thread1 = new DeadlockSum(true);
        Thread thread2 = new DeadlockSum(false);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }                   
    }
    
    public DeadlockSum(boolean reverse) {
        this.reverse = reverse;
    }

    public void run() { 
        if(reverse) {         
            synchronized(random2) {
				System.out.println("Reversed Thread: locked random2");
				try{ Thread.sleep(50); }
				catch(InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(random1) {
					System.out.println("Reversed Thread: locked random1");
					sum = random1.nextInt() + random2.nextInt();                
				}
            }
        }
        else {          
            synchronized(random1) {
				System.out.println("Normal Thread: locked random1");
				try { Thread.sleep(50); }
				catch(InterruptedException e) {
				  e.printStackTrace();
				}
				synchronized(random2) {
					System.out.println("Normal Thread: locked random2");              
					sum = random1.nextInt() + random2.nextInt();                
				}
			}
        }
    }
}
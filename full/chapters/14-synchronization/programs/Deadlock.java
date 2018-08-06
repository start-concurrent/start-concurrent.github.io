import java.util.Random;

public class Deadlock extends Thread {
	private static Random random1 = new Random();
	private static Random random2 = new Random();	
	private boolean reverse;
	private int sum;

	public static void main(String[] args) {
		Thread thread1 = new Deadlock( true );
		Thread thread2 = new Deadlock( false );
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}					
	}
	
	public Deadlock( boolean reverse ) {
		this.reverse = reverse;
	}

	public void run() {	
		if( reverse ) {			
	        synchronized(random2) {
			  System.out.println(
				"Reversed Thread: synchronized on random2");
			  try{ Thread.sleep(50); }
			  catch (InterruptedException e) {
				  e.printStackTrace();
			  }
			  synchronized(random1) {
			    System.out.println(
					"Reversed Thread: synchronized on random1");			    
			    sum = random1.nextInt() + random2.nextInt();			    
			  }
	        }
	    }
		else {			
	        synchronized(random1) {
			  System.out.println(
				"Normal Thread: synchronized on random1");
			  try { Thread.sleep(50); }
			  catch (InterruptedException e) {
				  e.printStackTrace();
			  }
			  synchronized(random2) {
			    System.out.println(
					"Normal Thread: synchronized on random2");			    
			    sum = random1.nextInt() + random2.nextInt();			    
			  }
		        }
		}
	}
}
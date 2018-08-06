import java.util.Random;

public class SumThread extends Thread {
	private static double[] data;	
	private double sum = 0.0;		
	private int lower;
	private int upper;	
	public static final int SIZE = 1000000;	
	public static final int THREADS = 8;
	
	public SumThread( int lower, int upper ) {		
		this.lower = lower;
		this.upper = upper;		
	}
	
	public void run() {
		for( int i = lower; i < upper; i++ )
			sum += Math.sin(data[i]);
	}

	public double getSum() { return sum; }
	
	public static void main( String[] args ) {	
		data = new double[SIZE];
		Random random = new Random();
		int start = 0;	
		for( int i = 0; i < SIZE; i++ )
			data[i] = random.nextDouble();	
		SumThread threads = new SumThread[THREADS];
		int quotient = data.length / THREADS;
		int remainder = data.length % THREADS;			
		for( int i = 0; i < THREADS; i++ ) {
			int work = quotient;
			if( i < remainder )
				work++;
			threads[i] = new SumThread( start, start + work );
			threads[i].start();
			start += work;
		}	
		
		double sum = 0.0;
		try	{ 
			for( int i = 0; i < THREADS; i++ ) {
				thread[i].join();
				sum += thread[i].getSum();
			}
			System.out.println("Sum: " + threads[0].getSum());
		}
		catch( InterruptedException e )	{
			e.printStackTrace();
		}
	}	
}
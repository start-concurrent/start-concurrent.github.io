import java.util.Random;

public class DiningPhilosopher extends Thread {
    public static final int SEATS = 5; 
    private static boolean[] chopsticks = new boolean[SEATS];   
    private int seat;
    
    public DiningPhilosopher(int seat) {
        this.seat = seat;       
    }
    
    public static void main(String args[]) {        
        DiningPhilosopher[] philosophers = new DiningPhilosopher[SEATS];
        for(int i = 0; i < SEATS; i++) {
            philosophers[i] = new DiningPhilosopher(i);
            philosophers[i].start();    //<.>
        }
        try {
            for(int i = 0; i < SEATS; i++)                        
                philosophers[i].join(); //<.>
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }       
        System.out.println("All philosophers done.");
    }
    
    public void run() {               	//<.>
        for(int i = 0; i < 100; i++) {	//<.>
            think();				   
            getChopsticks();           
            eat();
        }
    }
    
    private void think() {			  	//<.>
        Random random = new Random();
        try {
            sleep(random.nextInt(20) + 10);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private void getChopsticks() {	  	//<.>
        int location1 = seat;
        int location2 = (seat + 1) % SEATS;              
        synchronized(chopsticks) {	  	//<.>
            while(chopsticks[location1] || chopsticks[location2]) { //<.>
                try {
                    chopsticks.wait();	//<.>
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }                               
            }           
            chopsticks[location1] = true;
            chopsticks[location2] = true;
        }       
        System.out.println("Philosopher " + seat + " picked up chopsticks " +
			location1 + " and " + location2 + ".");
    }
    
    private void eat() { 			  	//<.>
        // Done eating, put back chopsticks
        synchronized(chopsticks) {	  	//<.>
            chopsticks[seat] = false;           
            if(seat == 0)
                chopsticks[SEATS - 1] = false;
            else
                chopsticks[seat - 1] = false;               
            chopsticks.notifyAll();   	//<.>
        }
    }
}

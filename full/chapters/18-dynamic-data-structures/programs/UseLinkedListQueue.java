public class UseLinkedListQueue extends Thread {
    private static final int THREADS = 10;
    private static LinkedListQueue queue = new LinkedListQueue(); // <1>
    private static boolean adding = true;
    
    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            threads[i] = new UseLinkedListQueue();
            threads[i].start(); // <2>
        }
        
        for (int i = 0; i < THREADS; i++)
            try { threads[i].join(); } // <4>
            catch (InterruptedException e) {}           
        
        adding = false;
        
        for (int i = 0; i < THREADS; i++) {
            threads[i] = new UseLinkedListQueue();
            threads[i].start(); // <5>
        }
 
        for (int i = 0; i < THREADS; i++)
            try { threads[i].join(); }
            catch (InterruptedException e) {}
        
        while( !queue.isEmpty() )
            System.out.println("Left in queue: ID = " +
                    queue.dequeue());
    }
    
    public void run() {
        if( adding ) {
            long ID = Thread.currentThread().getId();
            System.out.println("Thread ID added to queue: " +
                    Thread.currentThread().getId());
            queue.enqueue(String.valueOf(ID)); // <3>
        }
        else {
            String ID = queue.dequeue();
            System.out.println("Thread ID removed from queue: " + ID); // <6>
        }
    }
}
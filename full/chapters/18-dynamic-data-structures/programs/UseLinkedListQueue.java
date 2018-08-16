public class UseLinkedListQueue extends Thread {
    private static final int THREADS = 10;
    private static LinkedListQueue queue = new LinkedListQueue();/*@\label{lineQueueRef}@*/
    private static boolean adding = true;
    
    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS];
        for (int i = 0; i < THREADS; i++) {
            threads[i] = new UseLinkedListQueue();
            threads[i].start();/*@\label{lineStart10a}@*/
        }
        
        for (int i = 0; i < THREADS; i++)
            try { threads[i].join(); } /*@\label{lineJoin}@*/
            catch (InterruptedException e) {}           
        
        adding = false;
        
        for (int i = 0; i < THREADS; i++) {
            threads[i] = new UseLinkedListQueue();
            threads[i].start();/*@\label{lineStart10b}@*/
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
            queue.enqueue(String.valueOf(ID));
        }
        else {
            String ID = queue.dequeue();
            System.out.println("Thread ID removed from queue: "
                    + ID);
        }
    }
}
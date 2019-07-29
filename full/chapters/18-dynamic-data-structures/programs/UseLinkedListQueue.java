public class UseLinkedListQueue extends Thread {
    private static final int THREADS = 10;
    private LinkedListQueue queue;
    private boolean adding;
    
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[THREADS];
		LinkedListQueue queue = new LinkedListQueue(); // <.>
		
        for(int i = 0; i < THREADS; i++) {
            threads[i] = new UseLinkedListQueue(queue, true);
            threads[i].start();	// <.>
        }
        
        for(int i = 0; i < THREADS; i++)
			threads[i].join(); 	// <.>
                    
        for(int i = 0; i < THREADS; i++) {
            threads[i] = new UseLinkedListQueue(queue, false);
            threads[i].start();	// <.>
        }
 
        for(int i = 0; i < THREADS; i++)
            threads[i].join();
        
        while(!queue.isEmpty())
            System.out.println("Left in queue: ID = " + queue.dequeue());
    }
	
	public UseLinkedListQueue(LinkedListQueue queue, boolean adding) { //<.>
		this.queue = queue;
		this.adding = adding;
	}
    
    public void run() {
        if(adding) {
            long ID = Thread.currentThread().getId();
            System.out.println("Thread ID added to queue: " + ID);
            queue.enqueue("" + ID); // <.>
        }
        else {
            String ID = queue.dequeue();
            System.out.println("Thread ID removed from queue: " + ID); // <.>
        }
    }
}
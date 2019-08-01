import java.util.concurrent.*; //<.>
import java.util.ArrayList;

public class RootFutures {
    private static final int THREADS = 10; //<.>
    private static final int N = 100000000;
    private static final int FUTURES = 1000;
    
    public static void main(String[] args) {
        ArrayList<Future<Double>> futures = new ArrayList<>(FUTURES);     //<.>
        ExecutorService executor = Executors.newFixedThreadPool(THREADS); //<.>
        int work = N/FUTURES; //<.>
        
        System.out.println("Creating futures...");
        for(int i = 0; i < FUTURES; i++) {
            Callable<Double> summer = new RootSummer(1 + i*work, 1 + (i + 1)*work); //<.>
            Future<Double> future = executor.submit(summer); //<.>
            futures.add(future);
        }
        
        System.out.println("Getting results from futures...");
        double sum = 0.0;
        for(Future<Double> future: futures) { //<.>
            try {
                sum += future.get(); //<.>
            }
            catch(InterruptedException | ExecutionException e) { //<.>
                e.printStackTrace();
            }
        }
        executor.shutdown(); //<.>
        System.out.println("The sum of square roots is: " + sum); //<.>
    }
}
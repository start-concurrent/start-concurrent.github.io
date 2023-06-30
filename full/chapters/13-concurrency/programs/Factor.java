public class Factor {
    public static final int THREADS = 4; //<.>
    public static final long NUMBER = 59984005171248659L;
    
    public static void main(String[] args) {
        FactorThread[] threads = new FactorThread[THREADS]; //<.>
        long root = (long)Math.sqrt(NUMBER); // Go to square root
        long start = 3;  // No need to test 2       
        long quotient = root / THREADS;
        long remainder = root % THREADS;
        
        for(int i = 0; i < THREADS; i++) {
            long work = quotient;
            if(i < remainder)
                work++;
            threads[i] = new FactorThread(start, start + work); //<.>
            threads[i].start();
            start += work;
        }   
        try {
            for(int i = 0; i < THREADS; i++)
                threads[i].join(); //<.>
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class UnsafeRandom {
    private static int next = 1;
    private final static int A = 1103515245;
    private final static int B = 12345;
    private final static int M = 32768;
    
    public static int nextInt() {
        return next = (A*next + B) % M;
    }
}

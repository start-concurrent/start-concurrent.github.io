public class Summer implements Runnable {
    int[] array;
    int lower;
    int upper;
    int sum = 0;
    
    public Summer(int[] array, int lower, int upper) {
        this.array = array;
        this.lower = lower;
        this.upper = upper;
    }
    
    public void run() {
        for(int i = lower; i < upper; i++)
            sum += array[i];
    }
    
    public int getSum() { return sum; }
}
public class FactorThread extends Thread {  
    private long lower;
    private long upper; 
    
    public FactorThread(long lower, long upper) {     
        this.lower = lower;
        this.upper = upper;     
    }
    
    public void run() { 
        if(lower % 2 == 0) // Only check odd numbers
            lower++;        
        while(lower < upper) {
            if(Factor.NUMBER % lower == 0) {
                System.out.println("Security code: " + (lower + Factor.NUMBER / lower));
                return;
            }
            lower += 2;
        }           
    }
}

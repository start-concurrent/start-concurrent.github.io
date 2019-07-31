import java.util.concurrent.*;				//<.>

public class RootSummer implements Callable<Double> {
    private int min;
    private int max;
    
    public RootSummer(int min, int max) { 	//<.>
        this.min = min;
        this.max = max;
    }   
    
    public Double call() { 					//<.>
        double sum = 0.0;
        for(int i = min; i < max; ++i)
            sum += Math.sqrt(i);
        return sum;
    }
}
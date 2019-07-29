import java.util.Random;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Random random = new Random();        
        Vector<Integer> vector = new Vector<Integer>();
        
        int sum = 0;
        while(sum < 100) {
            int n = random.nextInt(10) + 1;
            vector.add(n);  // append n to end of vector
            sum += n;
        }

        for(int n: vector)
            System.out.format("%3d%n", n);
        System.out.println("---");
        System.out.format("%3d (%d values)%n", sum, vector.size());
    }
}

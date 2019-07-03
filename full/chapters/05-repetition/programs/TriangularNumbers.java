import java.util.*;

public class TriangularNumbers {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("How many triangular numbers? ");
        int n = in.nextInt();
        int sum;                        
        for(int i = 1; i <= n; i++) {
            sum = 0;            
            for(int j = 1; j <= i; j++)
                sum += j;
            System.out.println(sum);
        }
    }
}
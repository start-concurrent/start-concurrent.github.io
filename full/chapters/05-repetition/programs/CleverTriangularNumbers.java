import java.util.*;

public class CleverTriangularNumbers {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("How many triangular numbers? ");
        int n = in.nextInt();
        int triangular = 0;                     
        for(int i = 1; i <= n; i++) {         
            triangular += i;
            System.out.println(triangular);
        }
    }
}
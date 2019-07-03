import java.util.*;

public class QuietSummer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(in.hasNextInt())
            sum += in.nextInt();        
        System.out.println("The sum of the numbers is " + sum);
    }
}
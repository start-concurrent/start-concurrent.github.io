import java.util.*;

public class AssigningWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How long is your array? ");
        int n = in.nextInt();
        System.out.print("How many threads do you have? ");
        int k = in.nextInt();
        int quotient = n / k;
        int remainder = n % k;
        int next = 0;       
        for(int i = 0; i < k; i++) {      
            int work = quotient;
            if(i < remainder)
                work++;
            System.out.println("Thread " + i + " does " + work
                + " units of work, starting at index " + next
                + " and ending at index " + (next + work - 1));
            next += work;
        }
    }
}

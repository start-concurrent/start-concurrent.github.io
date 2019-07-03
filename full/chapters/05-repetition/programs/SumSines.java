import java.util.Scanner;

public class SumSines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int start = in.nextInt();
        System.out.print("Enter ending value: ");
        int end = in.nextInt();
        
        double sum = 0;
        for(int i = start; i <= end; i++)     
            sum += Math.sin(start);
        
        System.out.println("Sum of sines: " + sum);
    }
}
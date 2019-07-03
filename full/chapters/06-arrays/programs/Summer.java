import java.util.*;

public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Enter next number: ");
            sum += in.nextInt();
        }   
        System.out.println("The sum of the numbers is " + sum);
    }
}
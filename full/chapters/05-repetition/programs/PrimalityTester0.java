import java.util.*;

public class PrimalityTester0 {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a number: ");
        long number = in.nextLong();        
        boolean prime = true;
        for(long i = 2; i < number && prime; i++)
            if(number % i  ==  0)
                prime = false;
        if(prime)
            System.out.println(number + " is prime.");
        else
            System.out.println(number + " is not prime.");
    }
}
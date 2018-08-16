import java.util.*;

class CompoundInterestCalculator {   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        System.out.println("Compound Interest Calculator");
        System.out.println();
        System.out.print("Enter starting balance: ");
        double startingBalance = in.nextDouble();
        System.out.print("Enter interest rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter time in years: ");
        double years = in.nextDouble();        
        System.out.print("Enter compounding frequency: ");
        double frequency = in.nextDouble();
        double newBalance = startingBalance * 
            Math.pow(1.0 + rate/frequency, frequency*years);
        double interest = newBalance - startingBalance;
        System.out.println("Interest earned: $" + interest);
        System.out.println("New balance: $" + newBalance);
    }
}
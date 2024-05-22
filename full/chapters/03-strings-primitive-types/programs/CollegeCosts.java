import java.util.*; //<.>

public class CollegeCosts {
    public static void main(String[] args) { //<.>
        System.out.println("Welcome to the College Cost Calculator!"); //<.>
        Scanner in = new Scanner(System.in); //<.>
        
        System.out.print("Enter your first name:\t\t");
        String firstName = in.next(); //<.>
        System.out.print("Enter your last name:\t\t");
        String lastName = in.next(); //<.>
        System.out.print("Enter tuition per semester:\t$");
        double semesterTuition = in.nextDouble(); //<.>
        System.out.print("Enter rent per month:\t\t$");
        double monthlyRent = in.nextDouble(); //<.>
        System.out.print("Enter food cost per month:\t$");
        double monthlyFood = in.nextDouble(); //<.>
        System.out.print("Annual interest rate:\t\t");
        double annualInterest = in.nextDouble(); //<.>
        System.out.print("Years to pay back your loan:\t");
        int years = in.nextInt(); //<.>
        
        double yearlyCost = semesterTuition * 2.0 + (monthlyRent + monthlyFood) * 12.0; //<.>
        double fourYearCost = yearlyCost * 4.0; //<.>
        double monthlyInterest = annualInterest / 12.0; //<.>
        double monthlyPayment = fourYearCost * monthlyInterest / //<.>
            (1.0 - Math.pow(1.0 + monthlyInterest, -years * 12.0));
        double totalLoanCost = monthlyPayment * 12.0 * years; //<.>
                
        System.out.println("\nCollege costs for " + firstName + " " + lastName ); //<.>
        System.out.println("***************************************");
        System.out.format("Yearly cost:\t\t\t$%.2f%n", yearlyCost); //<.>
        System.out.format("Four year cost:\t\t\t$%.2f%n", fourYearCost);
        System.out.format("Monthly loan payment:\t\t$%.2f%n", monthlyPayment);
        System.out.format("Total loan cost:\t\t$%.2f%n", totalLoanCost );
    }
}

import java.util.*;

public class Quadratic {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);
        System.out.println("This program solves quadratic" + 
            " equations of the form ax^2 + bx + c = 0.");
        System.out.print("Please enter a value for a: "); // <.>
        double a = in.nextDouble();
        System.out.print("Please enter a value for b: ");
        double b = in.nextDouble();
        System.out.print("Please enter a value for c: ");
        double c = in.nextDouble();
        double discriminant = b*b - 4*a*c; // <.>
        if(discriminant == 0.0) // <.>
            System.out.println("The answer is x = " + (-b/(2*a)));
        else if(discriminant < 0.0) // <.>
            System.out.println("The answers are x = " + (-b / (2*a)) + " + "
				+ Math.sqrt(-discriminant) / (2*a) + "i and x = "
				+ (-b / (2*a)) + " - " + Math.sqrt(-discriminant) / (2*a) + "i");
        else // <.>
            System.out.println("The answers are x = " + (-b + Math.sqrt(discriminant))/(2*a)
				+ " and x = " + (-b - Math.sqrt(discriminant))/(2*a));
    }
}

import java.util.*; // <1>

public class GetInputCLI { // <2>
    public static void main(String[] args) { // <3>
        // Create an object named in for input
        Scanner in = new Scanner(System.in); // <4>
        
        // Declare variables to hold input data
        double height, coefficient; // <5>
        int bounces; 
        
        // Prompt the user and read data from the keyboard 
        System.out.println("Bouncing Ball: Subproblem 1"); // <6>
        System.out.print("Enter the height: "); 
        height = in.nextDouble(); // <7>
        System.out.print("Enter restitution coefficient: "); // <8>
        coefficient = in.nextDouble();
        System.out.print("Enter the number of bounces: "); 
        bounces = in.nextInt();
    } 
}

import java.util.*; 

public class BouncingBallCLI {
    public static void main(String[] args) {
        // Solution to subproblem 1
        // Create an object named in for input
        Scanner in = new Scanner(System.in);
        
        // Declare variables to hold input data
        double height, coefficient;
        int bounces;
 
        System.out.println("Bouncing Ball");
        
        // Prompt the user and read data from the keyboard
        System.out.println("Bouncing Ball: Subproblem 1");
        System.out.print("Enter the height: "); 
        height = in.nextDouble();
        System.out.print("Enter restitution coefficient: "); 
        coefficient = in.nextDouble();
        System.out.print("Enter the number of bounces: "); 
        bounces = in.nextInt();
        
        // Solution to subproblem 2
        double bounceHeight = height*Math.pow(coefficient,bounces);

        // Solution to subproblem 3
        String message = "After " + bounces +
            " bounces the height of the ball is: " + bounceHeight + " feet";
        System.out.println(message);
    }   
}
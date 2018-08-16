import java.util.*; 

public class Distance {
    public static void main(String[] args) {
        // Create an object named in for input
        Scanner in = new Scanner(System.in);   
        double speed, time;  
        double distance; // Distance to be computed       
        
        // Solution to subproblem 1: Read input
        // Prompt the user and get speed and time
        System.out.print("Enter the speed: "); /*@\label{solutionSubProblemOneScanner}@*/
        speed = in.nextDouble();/*@\label{getSpeed}@*/
        System.out.print("Enter the time: ");
        time = in.nextDouble();/*@\label{getDuration}@*/     
        
        // Solution to subproblem 2: Compute distance
        distance = speed*time;/*@\label{solutionSubProblemTwoScanner}@*/

        // Solution to subproblem 3: Display output
        System.out.print("Distance traveled: ");
        System.out.print( distance );
        System.out.println(" miles.");
    }
}

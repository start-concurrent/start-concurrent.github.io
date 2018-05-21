import java.util.*; 

public class GetInputCLI {
	public static void main(String[] args) {
    	// Create an object named in for input
        Scanner in = new Scanner(System.in); /*@\label{createScannerGetInputDataObject}@*/
        
        // Declare variables to hold input data
        double height, coefficient;
        int bounces; 
        
        // Declare user prompt strings
        String enterHeight = "Enter the height: ";
        String enterCoefficient =
        	"Enter restitution coefficient: ";        	        
        String enterBounces = "Enter the number of bounces: ";        
        
        // Prompt the user and read data from the keyboard 
        System.out.println("Bouncing Ball: Subproblem 1");
        System.out.print(enterHeight); 
        height = in.nextDouble();
        System.out.print(enterCoefficient); 
        coefficient = in.nextDouble();
        System.out.print(enterBounces); 
        bounces = in.nextInt();
    } 
}

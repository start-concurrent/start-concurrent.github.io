import javax.swing.*;

public class GetInputGUI {
	public static void main(String[] args) {
        String title = "Bouncing Ball: Subproblem 1";
        
        // Declare variables to hold input data
        double height, coefficient;
        int bounces; 
        
        // Declare user prompt strings
        String enterHeight = "Enter the height: ";
        String enterCoefficient = "Enter restitution coefficient: ";
        String enterBounces = "Enter the number of bounces: ";      
        
        // Prompt the user, get data, and convert it <1>
        String response = JOptionPane.showInputDialog(null, 
			enterHeight, title, JOptionPane.QUESTION_MESSAGE);
        height = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,
			enterCoefficient, title, JOptionPane.QUESTION_MESSAGE);
        coefficient = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,
			enterBounces, title, JOptionPane.QUESTION_MESSAGE);
        bounces = Integer.parseInt(response);
    } 
}

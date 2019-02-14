import javax.swing.*;

public class GetInputGUI {
    public static void main(String[] args) {
        String title = "Bouncing Ball: Subproblem 1";
        
        // Declare variables to hold input data
        double height, coefficient;
        int bounces; 
        
        // Prompt the user, get data, and convert it
        String response = JOptionPane.showInputDialog(null, // <1>
            "Enter the height: ", title, JOptionPane.QUESTION_MESSAGE);
        height = Double.parseDouble(response); // <2>
        response = JOptionPane.showInputDialog(null, // <3>
            "Enter restitution coefficient: ", title, JOptionPane.QUESTION_MESSAGE);
        coefficient = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,
            "Enter the number of bounces: ", title,
			JOptionPane.QUESTION_MESSAGE);
        bounces = Integer.parseInt(response);
    } 
}

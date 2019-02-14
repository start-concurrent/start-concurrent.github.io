import javax.swing.*;

public class BouncingBallGUI {
    public static void main(String [] args) {
        // Solution to sub-problem 1
        String title = "Bouncing Ball";
        double height, coefficient;
        int bounces; 
        
        // Prompt the user, get data, and convert it
        String response = JOptionPane.showInputDialog(null,
            "Enter the height: ", title, JOptionPane.QUESTION_MESSAGE);
        height = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,
            "Enter restitution coefficient: ", title, JOptionPane.QUESTION_MESSAGE);
        coefficient = Double.parseDouble(response); 
        response = JOptionPane.showInputDialog(null,
            "Enter the number of bounces: ", title, JOptionPane.QUESTION_MESSAGE);
        bounces = Integer.parseInt(response);

        // Solution to sub-problem 2
        double bounceHeight = height*Math.pow(coefficient,bounces);
        
        // Solution to sub-problem 3     
        String message = "After " + bounces +
            " bounces the height of the ball is: " + bounceHeight + " feet";
        JOptionPane.showMessageDialog(null,
            message, title, JOptionPane.INFORMATION_MESSAGE);       
    }  
}
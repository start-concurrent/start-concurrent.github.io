import javax.swing.*;

public class DisplayHeightGUI {
    public static void main(String[] args) {
        String title = "Bouncing Ball: Subproblem 3";
        // Use dummy values to test subproblem 3
        int bounces = 10;
        double bounceHeight = 2.0;   
        String message = "After " + bounces +
            " bounces the height of the ball is: " + bounceHeight + " feet";
        JOptionPane.showMessageDialog(null, message, title,
            JOptionPane.INFORMATION_MESSAGE);
    }
}

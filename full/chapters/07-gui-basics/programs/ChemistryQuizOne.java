import javax.swing.*;

public class ChemistryQuizOne {
    public static void main(String [] args) {
        String title = "Atoms in Water";
        String query = "How many atoms are in a molecule of water?";        
        String response = JOptionPane.showInputDialog(null, // <.>
            query, title, JOptionPane.QUESTION_MESSAGE);
        int answer = Integer.parseInt(response); // <.>
        String message;         
        if(answer == 3) // <.>
            message = "You're right!";
        else
            message = "Sorry, that's incorrect.";
        JOptionPane.showMessageDialog(null, message, title, // <.>
            JOptionPane.INFORMATION_MESSAGE);
    }   
}
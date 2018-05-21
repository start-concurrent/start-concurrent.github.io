import javax.swing.*;

public class ChemistryQuizOne {
    public static void main(String [] args) {
        String title = "Atoms in Water";
        String query = "How many atoms are in a molecule of water?";        
        String response = JOptionPane.showInputDialog(null,/*@\label{chemistryInputDialogLineOne}@*/
        	query, title, JOptionPane.QUESTION_MESSAGE);
        int answer = Integer.parseInt(response);/*@\label{chemistryConvertToIntegerLineOne}@*/
		String message;         
        if(answer == 3)
			message = "Good! That's correct!";
		else
			message = "Sorry, that's incorrect.";
        JOptionPane.showMessageDialog(null, message, title,
        	JOptionPane.INFORMATION_MESSAGE);
    }   
}
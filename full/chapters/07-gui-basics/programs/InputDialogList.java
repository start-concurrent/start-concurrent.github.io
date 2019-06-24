import javax.swing.*;

public class InputDialogList {    
	public static void main(String [] args) {
		String title="Basic Chemistry Quiz";        
        String question="Which of these is not a chemical element?";
		String[] materials = {"Iron", "Uranium", "Steel", "Nitrogen"};
        Object response=JOptionPane.showInputDialog(null, question, title, JOptionPane.QUESTION_MESSAGE, null, materials, null); /*@\label{inputDialogListLine}@*/
        String message;
		if(response.equals("Steel"))
			message = "You're right!";
		else
			message = "Sorry, correct answer: Steel."; /*@\label{incorrectAnswerLine}@*/            
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}   
}
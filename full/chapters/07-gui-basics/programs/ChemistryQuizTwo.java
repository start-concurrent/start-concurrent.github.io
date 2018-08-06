import javax.swing.*;

public class ChemistryQuizTwo {
    public static void main(String [] args) {     
		String title = "Heaviest Element";
        String query = "Which is the heaviest element?";
		String[] elements = {"Iron", "Uranium",	"Copernicium",
			"Nitrogen"};
        String response = (String)JOptionPane.showInputDialog(null, // <1>
        	query, title, JOptionPane.QUESTION_MESSAGE, null,
        	elements, null);
		String message;
        if(response.equals("Copernicium")) // <2>
			message = "You're right!";
        else
			message = "Sorry, correct answer: Copernicium.";               
		JOptionPane.showMessageDialog(null, message, title, // <3>
			JOptionPane.INFORMATION_MESSAGE);
    }   
}
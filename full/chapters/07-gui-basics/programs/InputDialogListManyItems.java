import javax.swing.*;

public class InputDialogListManyItems {

	public static void main(String [] args) {     
		String title = "Chemical Elements";
		String[] materials = {
            "Iron", "Uranium", "Steel", "Nitrogen", "Gold",
            "Calcium", "Sodium", "Potassium","Chromium", "Zinc",
            "Lithium", "Hydrogen", "Barium", "Manganese", "Cadmium",
            "Boron", "Aluminium", "Gallium", "Indium", "Thallium"};
        String question = "Which one of these is not a chemical element?";
        Object response = JOptionPane.showInputDialog(null, question, title,JOptionPane.QUESTION_MESSAGE, /*@\label{inputDialogListLine}@*/
                                                    null, materials, null);  
		String message;
        if(response.equals("Steel"))
			message = "You're right!";
		else
			message = "Sorry, correct answer: Steel.";
		JOptionPane.showMessageDialog(null,message,title, JOptionPane.INFORMATION_MESSAGE); /*@\label{incorrectElementLine}@*/
	}   
}
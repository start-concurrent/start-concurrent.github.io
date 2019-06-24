import javax.swing.*;

public class ChemistryQuizTwo {
    public static void main(String [] args) {     
        String title = "Heaviest Element";
        String query = "Which is the heaviest element?";
        String[] elements = {"Iron", "Uranium", "Copernicium", "Nitrogen"};
        String response = (String)JOptionPane.showInputDialog(null, // <.>
            query, title, JOptionPane.QUESTION_MESSAGE, null, elements, null);
        String message;
        if(response.equals("Copernicium")) // <.>
            message = "You're right!";
        else
            message = "Sorry, correct answer: Copernicium.";               
        JOptionPane.showMessageDialog(null, message, title, // <.>
            JOptionPane.INFORMATION_MESSAGE);
    }   
}
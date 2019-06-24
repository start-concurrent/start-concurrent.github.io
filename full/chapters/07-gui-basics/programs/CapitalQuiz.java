import javax.swing.*;

public class CapitalQuiz {    
    public static void main(String[] args) {     
        String title = "Capital Quiz";
        String country = "Azerbaijan";
        String[] capitals = {"Bujumbura","Baku", "Moroni"};
        int correct = 1; //Baku is the correct answer        
        String question = "Select the capital of " + country + ".";
        int response = JOptionPane.showOptionDialog(null, // <.>
            question, title, JOptionPane.PLAIN_MESSAGE,
            JOptionPane.QUESTION_MESSAGE, null, capitals, null);
        //Response is 0, 1, or 2 for the three options
        String message;     
        if(response == correct) 
            message = "You're right!";
        else
            message = "Sorry, the capital of " + country +
				" is " + capitals[correct] + ".";
        JOptionPane.showMessageDialog(null, message, title, // <.>
            JOptionPane.INFORMATION_MESSAGE);        
    }   
}
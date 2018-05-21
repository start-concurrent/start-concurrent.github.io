import javax.swing.*;
import java.util.*;

public class OddEvenTest {
    public static void main(String [] args) { 
        Random random = new Random(); 
		String title = "Odd Even Test";
        int x = random.nextInt(10); //Random int from 0 to 9
        String question = "Is " + x + " an odd integer?";
        int response = JOptionPane.showConfirmDialog(null,/*@\label{yes-noDialogLine}@*/
        		question, title, JOptionPane.YES_NO_OPTION);
		String message;		
        // Response is YES_OPTION for Yes, NO_OPTION for No.
        if((response==JOptionPane.YES_OPTION && x%2 != 0) ||
        	(response==JOptionPane.NO_OPTION && x%2 == 0))
			message = "You're right!"; /*@\label{correctAnswerLine}@*/
        else
			message = "Sorry, that's incorrect."; /*@\label{incorrectAnswerLine}@*/
        JOptionPane.showMessageDialog(null, message, title,
        	JOptionPane.INFORMATION_MESSAGE);
    }   
}
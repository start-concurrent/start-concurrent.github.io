import javax.swing.*;
import java.util.*;

public class OddEvenTest {
    public static void main(String [] args) { 
        String title = "Odd Even Test";
        Random random = new Random(); // <1>
        int x = random.nextInt(10); 
        String question = "Is " + x + " an odd integer?";
        int response = JOptionPane.showConfirmDialog(null, // <2>
            question, title, JOptionPane.YES_NO_OPTION);
        String message;     
        // Response is YES_OPTION for yes, NO_OPTION for no
        if((response == JOptionPane.YES_OPTION && x % 2 != 0) ||
            (response == JOptionPane.NO_OPTION && x % 2 == 0))
            message = "You're right!";
        else
            message = "Sorry, that's incorrect.";
        JOptionPane.showMessageDialog(null, message, title, // <3>
            JOptionPane.INFORMATION_MESSAGE);
    }   
}
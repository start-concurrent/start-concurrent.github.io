import javax.swing.*;/*@\label{importSwing}@*/

public class SimpleDialog {    
    public static void main(String [] args) {     
        JOptionPane.showMessageDialog( null,/*@\label{showMessageDialogLine}@*/
        	"Task completed. Click OK to exit",			
            "Simple Dialog", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Done."); /*@\label{displayMessageLine}@*/
    }
}
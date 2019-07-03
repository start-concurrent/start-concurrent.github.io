import javax.swing.*;
public class InputDialog {    
    public static void main(String [] args){  
		String title="Bouncing Ball";        
        String enterHeight = "Enter the height from which the ball is dropped.";
        String enterRestitution = "Enter the coefficient of restitution of the ball.";
        String enterBounces = "Enter the number of bounces after which you want the height calculated.";
        String thankYou = "Thank you, all data has been entered.";
        
        String response = JOptionPane.showInputDialog(null, enterHeight, title, JOptionPane.QUESTION_MESSAGE);/*@\label{inputDialogLineOneGui}@*/
        double height = Double.parseDouble(response);/*@\label{convertToDoubleLineOneGui}@*/
        
        response = JOptionPane.showInputDialog(null,enterRestitution, title, JOptionPane.QUESTION_MESSAGE);/*@\label{inputDialogLineTwoGui}@*/
        double restitution = Double.parseDouble(response); /*@\label{convertToDoubleLineTwoGui}@*/
        
        response = JOptionPane.showInputDialog(null, enterBounces, title, JOptionPane.QUESTION_MESSAGE);/*@\label{inputDialogLineThreeGui}@*/
        double bounces = Integer.parseInt(response); /*@\label{convertToDoubleLineThreeGui}@*/       
        
        JOptionPane.showMessageDialog(null, thankYou, title, JOptionPane.INFORMATION_MESSAGE);
    }   
}
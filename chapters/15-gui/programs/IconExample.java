import javax.swing.*;
import java.awt.*;

public class IconExample {   
  public static void main(String[] args) {
	JFrame iconFrame = new JFrame("Icon Example");	   
	ImageIcon smileIcon = new ImageIcon(/*@\label{iconCreationLine}@*/
		"pictures/smile.jpg");
	JButton  smile = new JButton(smileIcon);/*@\label{adIconToButtonLine}@*/
	iconFrame.add(smile);
	iconFrame.setSize(325,250);
	iconFrame.setDefaultCloseOperation(
		JFrame.DISPOSE_ON_CLOSE);
	iconFrame.setVisible(true);
  }  
}
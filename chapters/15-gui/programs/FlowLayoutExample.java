import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("FlowLayout Example"); 
    JPanel panel = new JPanel(new FlowLayout());  /*@\label{setLayoutManagerLine}@*/
    final int MAX_BUTTONS = 6;    
    for(int i = 0; i < MAX_BUTTONS; i++)
    	panel.add(new JButton("   " + i + "   "));/*@\label{createAButtonLine}@*/
    frame.add(panel);
    frame.setSize(250,100);
    frame.setResizable(false);/*@\label{disableResizableLine}@*/
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
    frame.setVisible(true);       
  }  
}
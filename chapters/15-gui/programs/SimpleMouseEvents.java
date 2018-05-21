import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMouseEvents implements MouseListener {/*@\label{simpleMouseEventsClassDefLine}@*/
	JFrame frame = new JFrame("Mouse Events");
	JTextField status = new JTextField(
		"Mouse status comes here.");
	JButton one = new JButton("One");
	JButton two = new JButton("Two");
	int oneClicks = 0, twoClicks = 0; //Number of clicks
    
    public SimpleMouseEvents() {/*@\label{simpleMouseEventsConstructorLine}@*/
        JPanel panel = new JPanel();    	
        one.addMouseListener(this);
        two.addMouseListener(this);
        panel.add(one);
        panel.add(two);
        panel.add(status); 
        frame.add(panel);
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(
        	JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true); 
    }

    // Implement all abstract methods in MouseListener
    public void mouseEntered(MouseEvent e) { /*@\label{mouseEnteredEventLine}@*/	    
	    if (e.getSource() == one) /*@\label{getObjectEnteredLine}@*/
	        status.setText("Mouse enters One.");
	    else
	        status.setText("Mouse enters Two.");      
    }
    
	public void mouseClicked(MouseEvent e) {		
		if (e.getSource() == one) {/*@\label{getObjectClickedLine}@*/
			oneClicks++;
			status.setText("One clicked "+ oneClicks +
				" times.");
		}			
		else {
			twoClicks++;
			status.setText("Two clicked "+ twoClicks  +
				" times.");
		}
	}

	public void mouseExited(MouseEvent e) {} /*@\label{exitedNotImplementedLine}@*/
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {} 
	public static void main(String[] args){
		  new SimpleMouseEvents();
	}  
}
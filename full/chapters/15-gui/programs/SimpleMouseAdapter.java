import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMouseAdapter extends MouseAdapter { // <1>
    JFrame frame = new JFrame("Mouse Events");    
    JTextField status = new JTextField(
    	"Mouse status comes here.");
    JButton one = new JButton("One");
    JButton two = new JButton("Two");
    int oneClicks = 0, twoClicks = 0; 
    
    public SimpleMouseAdapter () {
    	JPanel panel = new JPanel();
        one.addMouseListener(this);
        two.addMouseListener(this);
        panel.add(one);
        panel.add(two);
        panel.add(status); 
        frame.add(panel);
        frame.setSize(200,100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true); 
    }
    
    // Override only those methods we want
    public void mouseEntered(MouseEvent e) { // <2> 
	    if (e.getSource() == one)
	        status.setText("Mouse enters One.");
	    else
	        status.setText("Mouse enters Two.");      
    }
    
    public void mouseClicked(MouseEvent e) { // <3>
    	if (e.getSource() == one) {
			oneClicks++;
			status.setText("One clicked "+ oneClicks + " times.");
		}			
		else {
			twoClicks++;
			status.setText("Two clicked "+ twoClicks  + " times.");
		}
    }
    
    public static void main(String[] args){
		new SimpleMouseAdapter ();
    }  
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnresponsiveGUI extends JFrame
	implements ActionListener {
	JLabel label = new JLabel("Answer:");
	JButton compute = new JButton("Compute");
	JLabel counter = new JLabel("0");
	JButton increment = new JButton("Increment");
	int count = 0;
	
	public static void main(String args[]) {
		UnresponsiveGUI frame = new UnresponsiveGUI();		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(250,150);
		frame.setVisible(true);
	}
	
	public UnresponsiveGUI() {
		setLayout(new GridLayout(4,1));
		setTitle("Unresponsive GUI");				
		add(label);		
		compute.addActionListener(this);
		add(compute);		
		add(counter);
		increment.addActionListener(this);
		add(increment);		
	}	
	
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == compute ) {			
			label.setText("Computing...");
	    	try {
	            Thread.sleep(5000);/*@\label{unresponsive sleep}@*/
	        } catch( Exception ignore ) { }
	        label.setText("Answer: " + Math.sqrt(2.0));
		}
		else {
			count++;
			counter.setText("" + count);
		}
	}
}
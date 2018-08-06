import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkerGUI extends JFrame implements ActionListener {
	JLabel label = new JLabel("Answer:");
	JButton compute = new JButton("Compute");
	JLabel counter = new JLabel("0");
	JButton increment = new JButton("Increment");
	int count = 0;	
	
	public static void main(String args[]) {
		WorkerGUI frame = new WorkerGUI();		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(250,150);
		frame.setVisible(true);
	}
	
	public WorkerGUI() {
		setLayout(new GridLayout(4,1));
		setTitle("Worker GUI");				
		add(label);		
		compute.addActionListener(this);
		add(compute);		
		add(counter);
		increment.addActionListener(this);
		add(increment);		
	}
	
	public void actionPerformed(ActionEvent e) {
		if( e.getSource() == compute ) {
			SwingWorker worker = new SwingWorker<String, Void>() {		    
			    public String doInBackground() {
			    	try {
			            Thread.sleep(5000);
			        } catch( Exception ignore ) {}
			        return "Answer: " + Math.sqrt(2.0);
			    }
			    
			    public void done() {
			        try {
			        	label.setText(get());
			        } catch (Exception ignore) {}		       
			    }
			};
			
			worker.execute();
			label.setText("Computing...");
		}
		else {
			count++;
			counter.setText("" + count);
		}
	}
}
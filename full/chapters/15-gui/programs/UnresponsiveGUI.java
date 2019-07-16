import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnresponsiveGUI implements ActionListener {
    private JLabel answerLabel = new JLabel("Answer:");
    private JButton computeButton = new JButton("Compute");
    private JLabel countLabel = new JLabel("0");
    private JButton incrementButton = new JButton("Increment");
    private int count = 0;
        
    public UnresponsiveGUI() {
        JFrame frame = new JFrame("Unresponsive GUI");
		frame.setLayout(new GridLayout(4,1));               
        computeButton.addActionListener(this);
		incrementButton.addActionListener(this);
		frame.add(answerLabel);
        frame.add(computeButton);       
        frame.add(countLabel);
        frame.add(incrementButton);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300,150);
        frame.setVisible(true);		
    }   
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == computeButton) {            
            answerLabel.setText("Computing...");
            try {
                Thread.sleep(5000);
            }
			catch(InterruptedException ignore) { }
            answerLabel.setText("Answer: " + Math.sqrt(2.0));
        }
        else {
            count++;
            countLabel.setText("" + count);
        }
    }	
	
    public static void main(String args[]) {
        new UnresponsiveGUI();              
    }
}
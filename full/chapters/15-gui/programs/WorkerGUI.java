import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkerGUI implements ActionListener {
    private JLabel answerLabel = new JLabel("Answer:");
    private JButton computeButton = new JButton("Compute");
    private JLabel countLabel = new JLabel("0");
    private JButton incrementButton = new JButton("Increment");
    private int count = 0;  
       
    public WorkerGUI() {
		JFrame frame = new JFrame("Worker GUI");
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
            SwingWorker worker = new SwingWorker<String, Void>() { //<.>
                public String doInBackground() { //<.>
                    try {
                        Thread.sleep(5000);
                    }
					catch(Exception ignore) {}
                    return "Answer: " + Math.sqrt(2.0); //<.>
                }
                
                public void done() { //<.>
                    try {
                        answerLabel.setText(get());
                    }
					catch (Exception ignore) {}              
                }
            };            
            worker.execute(); //<.>
            answerLabel.setText("Computing...");
        }
        else {
            count++;
            countLabel.setText("" + count);
        }
    }
	
	public static void main(String args[]) {
		new WorkerGUI();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WorkerGUI extends JFrame implements ActionListener {
    private JLabel answerLabel = new JLabel("Answer:");
    private JButton computeButton = new JButton("Compute");
    private JLabel countLabel = new JLabel("0");
    private JButton incrementButton = new JButton("Increment");
    private int count = 0;  
    
    public static void main(String args[]) {
        WorkerGUI frame = new WorkerGUI();      
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250,150);
        frame.setVisible(true);
    }
    
    public WorkerGUI() {
        setLayout(new GridLayout(4,1));
        setTitle("Worker GUI");             
        add(answerLabel);     
        computeButton.addActionListener(this);
        add(computeButton);       
        add(countLabel);
        incrementButton.addActionListener(this);
        add(incrementButton);     
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == computeButton) {
            SwingWorker worker = new SwingWorker<String, Void>() {          
                public String doInBackground() {
                    try {
                        Thread.sleep(5000);
                    } catch(Exception ignore) {}
                    return "Answer: " + Math.sqrt(2.0);
                }
                
                public void done() {
                    try {
                        answerLabel.setText(get());
                    } catch (Exception ignore) {}              
                }
            };
            
            worker.execute();
            answerLabel.setText("Computing...");
        }
        else {
            count++;
            countLabel.setText("" + count);
        }
    }
}
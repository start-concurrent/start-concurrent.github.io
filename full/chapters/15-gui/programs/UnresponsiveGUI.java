import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnresponsiveGUI extends JFrame implements ActionListener {
    private JLabel answerLabel = new JLabel("Answer:");
    private JButton computeButton = new JButton("Compute");
    private JLabel countLabel = new JLabel("0");
    private JButton incrementButton = new JButton("Increment");
    private int count = 0;
    
    public static void main(String args[]) {
        UnresponsiveGUI frame = new UnresponsiveGUI();      
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(250,150);
        frame.setVisible(true);
    }
    
    public UnresponsiveGUI() {
        setLayout(new GridLayout(4,1));
        setTitle("Unresponsive GUI");               
        add(answerLabel);     
        computeButton.addActionListener(this);
        add(computeButton);       
        add(countLabel);
        incrementButton.addActionListener(this);
        add(incrementButton);     
    }   
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == computeButton) {            
            answerLabel.setText("Computing...");
            try {
                Thread.sleep(5000);
            } catch(InterruptedException ignore) { }
            answerLabel.setText("Answer: " + Math.sqrt(2.0));
        }
        else {
            count++;
            countLabel.setText("" + count);
        }
    }
}
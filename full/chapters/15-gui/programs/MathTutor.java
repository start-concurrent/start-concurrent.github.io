import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MathTutor implements ActionListener, ItemListener {
    private JMenuItem add = new JMenuItem("Addition"); // <.>
    private JMenuItem subtract = new JMenuItem("Subtraction");
    private JMenuItem multiply = new JMenuItem("Multiply");
    private JMenuItem divide = new JMenuItem ("Divide");
    private JLabel score = new JLabel("Score: 0 Correct 0 Incorrect");
    private JLabel label = new JLabel();
    private JTextField field = new JTextField(10);
    private JButton submitButton = new JButton("Submit");
	private ProblemGenerator generator = new ProblemGenerator(); //<.>
	private int correct = 0;	//<.>
    private int incorrect = 0;
    private int answer = -1;

    public MathTutor() { // <.>
        JFrame frame = new JFrame("Math Tutor");
        JMenuBar menuBar = new JMenuBar();
        JMenu typeMenu = new JMenu("Type");
        JMenu operationsMenu = new JMenu("Operations");    
        JCheckBoxMenuItem advanced = new JCheckBoxMenuItem("Advanced");
        // Add listeners to menu items <.>
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
		advanced.addItemListener(this); //<.>
		//Add anonymous ActionListener to submitButton <.>
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = Integer.parseInt(field.getText());
				if(response == answer)
					correct++;
				else
					incorrect++;                        
				label.setText("");
				score.setText("Score: " + correct + " Correct " +
					incorrect + " Incorrect");
				submitButton.setEnabled(false);
			}			
		});        
        typeMenu.add(advanced); // <.>
        operationsMenu.add(add); // <.>
        operationsMenu.add(subtract);
        operationsMenu.add(multiply);
        operationsMenu.add(divide);  
        multiply.setEnabled(false); //<.>
        divide.setEnabled(false);
        menuBar.add(typeMenu); // <.>
        menuBar.add(operationsMenu);        
        frame.setJMenuBar(menuBar);
        // Add components to frame and display GUI <.>
        frame.add(score, BorderLayout.NORTH);
        frame.add(label, BorderLayout.WEST);
        frame.add(field, BorderLayout.EAST);
        frame.add(submitButton, BorderLayout.SOUTH);
		submitButton.setEnabled(false);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true); 
    }
    
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            add.setEnabled(false); 
            subtract.setEnabled(false);
            multiply.setEnabled(true); 
            divide.setEnabled(true);
        }
        else {
            add.setEnabled(true);
            subtract.setEnabled(true); 
            multiply.setEnabled(false); 
            divide.setEnabled(false);
        }
    }
    
    public void actionPerformed(ActionEvent e){
        Object menuItem = e.getSource();	
		if(menuItem == add)
			answer = generator.addPractice(label);
		else if(menuItem == subtract)
			answer = generator.subtractPractice(label);
		else if(menuItem == multiply)
			answer = generator.multiplyPractice(label);
		else if(menuItem == divide)
			answer = generator.dividePractice(label);
		submitButton.setEnabled(true);	
		field.setText("");		
    }

    public static void main(String[] args){       
        new MathTutor();
    }  
}

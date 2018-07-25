import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MathTutor implements ActionListener, ItemListener {
	private JMenuItem add = new JMenuItem("Addition"); // <1>
	private JMenuItem subtract = new JMenuItem("Subtraction");
	private JMenuItem multiply = new JMenuItem("Multiply");
	private JMenuItem divide = new JMenuItem ("Divide");
    private JLabel score = new JLabel("Score: 0 Correct 0 Incorrect");
    private JLabel label = new JLabel();
    private JTextField field = new JTextField(10);
    private JButton submit = new JButton("Submit");

    public MathTutor() { // <2>
        JFrame frame = new JFrame("Math Tutor");
        JMenuBar menuBar = new JMenuBar();
        JMenu type = new JMenu("Type");
        JMenu operations = new JMenu("Operations");    
        JCheckBoxMenuItem advanced =
        	new JCheckBoxMenuItem("Advanced");
    	// Add ActionListeners to menu items 
    	add.addActionListener(this); // <3>
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);    	        
        // Add ItemListener to checkbox menu item    	
        advanced.addItemListener(this);
        // Fill menu for problem type         
        type.add(advanced); // <4>
        // Fill menu for operations
        operations.add(add);
        operations.add(subtract);
        operations.add(multiply);
        operations.add(divide);  
        // Disable advanced operations 
        multiply.setEnabled(false); // <5>
        divide.setEnabled(false);
        // Fill menu bar set on frame
        menuBar.add(type); // <6>
        menuBar.add(operations);        
        frame.setJMenuBar(menuBar);
		// Add widgets to frame and display GUI
        frame.add( score, BorderLayout.NORTH );
        frame.add( label, BorderLayout.WEST );
        frame.add( field, BorderLayout.EAST );
        frame.add( submit, BorderLayout.SOUTH );         
        frame.setSize(250, 125);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true); 
    }
    
    public void itemStateChanged(ItemEvent e) { // <7>
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
    
    public void actionPerformed(ActionEvent e){ // <8>
    	Object menuItem = e.getSource();        
    	if( menuItem == add )
    		ProblemGenerator.addPractice( label );
        else if( menuItem == subtract )
        	ProblemGenerator.subtractPractice( label );
        else if( menuItem == multiply )
        	ProblemGenerator.multiplyPractice( label );
        else if( menuItem == divide )
        	ProblemGenerator.dividePractice( label ); 
    	field.setText("");
    }

    public static void main(String[] args){ // <9>        
        new MathTutor();
    }  
}
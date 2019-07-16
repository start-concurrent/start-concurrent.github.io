import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MathTutorApplet extends JApplet
    implements ActionListener, ItemListener {
    private JMenuItem add = new JMenuItem("Addition");
    private JMenuItem subtract = new JMenuItem("Subtraction");
    private JMenuItem multiply = new JMenuItem("Multiply");
    private JMenuItem divide = new JMenuItem ("Divide");
    private JLabel score = new JLabel("Score: 0 Correct 0 Incorrect");
    private JLabel label = new JLabel();
    private JTextField field = new JTextField(10);
    private JButton submit = new JButton("Submit");
    private int correct = 0;
    private int incorrect = 0;
    private int answer = -1;

    public void init() {        
        JMenuBar menuBar = new JMenuBar();
        JMenu typeMenu = new JMenu("Type");
        JMenu operationsMenu = new JMenu("Operations");    
        JCheckBoxMenuItem advanced = new JCheckBoxMenuItem("Advanced");
        // Add ActionListeners to menu items and buttons        
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);   
        submit.addActionListener(this);
        // Add ItemListener to checkbox menu item       
        advanced.addItemListener(this);
        // Fill menu for problem type         
        typeMenu.add(advanced);
        // Fill menu for operations
        operationsMenu.add(add);
        operationsMenu.add(subtract);
        operationsMenu.add(multiply);
        operationsMenu.add(divide);  
        // Disable advanced operations and submit 
        multiply.setEnabled(false);
        divide.setEnabled(false);
        submit.setEnabled(false);
        // Fill menu bar and set on applet
        menuBar.add(typeMenu);
        menuBar.add(operationsMenu);        
        setJMenuBar(menuBar);
        // Add widgets to applet content
        add(score, BorderLayout.NORTH);
        add(label, BorderLayout.WEST);
        add(field, BorderLayout.EAST);
        add(submit, BorderLayout.SOUTH);
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
    
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource(); 
        if(object == submit) {
            int response = Integer.parseInt(field.getText());
            if(response == answer)
                correct++;
            else
                incorrect++;                        
            label.setText("");
            score.setText("Score: " + correct + " Correct " +
                incorrect + " Incorrect");
            submit.setEnabled(false);
        }
        else {          
            if(object == add)
                answer = ProblemGenerator.addPractice(label);
            else if(object == subtract)
                answer = ProblemGenerator.subtractPractice(label);
            else if(object == multiply)
                answer = ProblemGenerator.multiplyPractice(label);
            else if(object == divide)
                answer = ProblemGenerator.dividePractice(label);
            submit.setEnabled(true);
        }
        field.setText("");
    }
}
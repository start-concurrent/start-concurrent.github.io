import javax.swing.*;
import java.awt.event.*;

public class CheckBoxExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Check Box Example"); //<.>
        JPanel panel = new JPanel();
		
        JCheckBox nastyCheckBox = new JCheckBox("Nasty"); //<.>
		JCheckBox brutishCheckBox = new JCheckBox("Brutish"); 
		JCheckBox shortCheckBox = new JCheckBox("Short"); 		
        JTextField field = new JTextField("Here's what your life is like.");
		
        panel.add(nastyCheckBox); //<.>
        panel.add(brutishCheckBox);
        panel.add(shortCheckBox);
		panel.add(field);
		
        // Add item listeners to the check boxes
        nastyCheckBox.addItemListener(new ItemListener() { //<.>
            public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					field.setText("Your life is nasty.");
				else
					field.setText("Your life isn't nasty.");
            }
        });
        brutishCheckBox.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
					field.setText("Your life is brutish.");
				else
					field.setText("Your life isn't brutish.");
            }
        });
        shortCheckBox.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
					field.setText("Your life is short.");
				else
					field.setText("Your life isn't short.");
            }
        });
        frame.add(panel);  //<.>
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);       
    }  
}
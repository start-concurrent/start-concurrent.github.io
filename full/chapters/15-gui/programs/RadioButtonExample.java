import javax.swing.*;
import java.awt.event.*;

public class RadioButtonExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Radio Button Example");
        JPanel panel = new JPanel();
		
        JRadioButton halfEmptyButton = new JRadioButton("Half empty"); //<.>
		JRadioButton halfFullButton = new JRadioButton("Half full"); 
		JRadioButton twiceTheSizeButton = new JRadioButton("Twice the needed size"); 		
        JTextField positiveField = new JTextField("Positive statement about the glass.");
		JTextField negativeField = new JTextField("Negative statement about the glass.");
		
		ButtonGroup group = new ButtonGroup(); //<.>
		group.add(halfEmptyButton);
		group.add(halfFullButton);
		group.add(twiceTheSizeButton);		
		
        panel.add(halfEmptyButton); //<.>
        panel.add(halfFullButton);
        panel.add(twiceTheSizeButton);
		panel.add(positiveField);
		panel.add(negativeField);
		
        // Add item listeners to the radio buttons
        halfEmptyButton.addItemListener(new ItemListener() { //<.>
            public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
					positiveField.setText("The glass is half empty.");
				else
					negativeField.setText("And it's not half empty.");
            }
        });
        halfFullButton.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
					positiveField.setText("The glass is half full.");
				else
					negativeField.setText("And it's not half full.");
            }
        });
        twiceTheSizeButton.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
					positiveField.setText("The glass is twice the needed size.");
				else
					negativeField.setText("And it's not twice the needed size.");
            }
        });
        frame.add(panel);  //<.>
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);       
    }  
}
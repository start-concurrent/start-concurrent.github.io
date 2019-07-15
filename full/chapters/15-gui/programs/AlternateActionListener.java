import javax.swing.*;
import java.awt.event.*;

public class AlternateActionListener implements ActionListener {
	private JFrame frame = new JFrame("Button Example"); 
	private JPanel panel = new JPanel();	
	private JButton thisButton = new JButton("This"); 
	private JButton thatButton = new JButton("That"); 
	private JButton exitButton = new JButton("Exit"); 
	private JTextField field = new JTextField("Text input and output area");
  
	public AlternateActionListener (){ //<.>
		thisButton.addActionListener(this); 
		thatButton.addActionListener(this);
		exitButton.addActionListener(this);

		panel.add(thisButton);
		panel.add(thatButton);
		panel.add(field);
		panel.add(exitButton);    
		frame.add(panel);

		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);       
	}     

	public void actionPerformed(ActionEvent e){ //<.>
		Object button = e.getSource(); //<.>
		if(button == thisButton) //<.>
			field.setText("You can get with this."); 
		else if(button == thatButton) 
			field.setText("Or you can get with that.");
		else {
			System.out.println("Exit");
			frame.dispose();
		}
	}

	public static void main(String[] args){ //<.>
		new AlternateActionListener(); 
	}   
}
import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator Layout"); 
		frame.setLayout(new BorderLayout());
		JPanel numbers = new JPanel(new GridLayout(4,3));
		numbers.add(new JButton("7"));
		numbers.add(new JButton("8"));
		numbers.add(new JButton("9"));
		numbers.add(new JButton("4"));
		numbers.add(new JButton("5"));
		numbers.add(new JButton("6"));
		numbers.add(new JButton("1"));
		numbers.add(new JButton("2"));
		numbers.add(new JButton("3"));
		numbers.add(new JButton("0"));
		numbers.add(new JButton("+"));
		numbers.add(new JButton("-"));
		frame.add(numbers, BorderLayout.CENTER);
		JButton enter = new JButton("Enter");
		frame.add(enter, BorderLayout.SOUTH);
		JLabel display = new JLabel("0");
		frame.add(display, BorderLayout.NORTH);
		frame.setSize(300,350);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
		frame.setVisible(true);       
	}  
}
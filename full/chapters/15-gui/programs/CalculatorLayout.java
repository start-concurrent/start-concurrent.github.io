import javax.swing.*;
import java.awt.*;

public class CalculatorLayout {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Calculator Layout"); 
    JPanel panel = new JPanel(new BorderLayout());
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
    panel.add(numbers, BorderLayout.CENTER);
    JButton enter = new JButton("Enter");
    panel.add(enter, BorderLayout.SOUTH);
    JLabel display = new JLabel("0");
    panel.add(display, BorderLayout.NORTH);
    frame.add(panel);
    frame.setSize(250,300);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
    frame.setVisible(true);       
  }  
}
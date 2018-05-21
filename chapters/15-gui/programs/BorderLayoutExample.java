import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("BorderLayout Example"); 
    JPanel panel = new JPanel(new BorderLayout());
    panel.add(new JButton("North"), BorderLayout.NORTH);
    panel.add(new JButton("South"), BorderLayout.SOUTH);
    panel.add(new JButton("East"), BorderLayout.EAST);
    panel.add(new JButton("West"), BorderLayout.WEST);
    panel.add(new JButton("Center"), BorderLayout.CENTER);
    frame.add(panel);
    frame.setSize(300,200);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
    frame.setVisible(true);       
  }  
}
import javax.swing.*;
import java.awt.*;

public class LabelExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Label Example");
		ImageIcon hibiscus = new ImageIcon("pictures/hibiscus.jpg");
		JLabel flower = new JLabel("Red Hibiscus", hibiscus, JLabel.CENTER);
		flower.setVerticalTextPosition(JLabel.BOTTOM); // <1> 
		flower.setHorizontalTextPosition(JLabel.CENTER); // <2>
		frame.add(flower);
		frame.setSize(300,250);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
  }  
}
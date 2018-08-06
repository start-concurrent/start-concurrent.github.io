import javax.swing.*;
import java.awt.*;

public class IconExample {   
	public static void main(String[] args) {
		JFrame iconFrame = new JFrame("Icon Example");	   
		ImageIcon smileIcon = new ImageIcon("pictures/smile.jpg"); // <1>
		JButton  smile = new JButton(smileIcon); // <2>
		iconFrame.add(smile);
		iconFrame.setSize(325,250);
		iconFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		iconFrame.setVisible(true);
  }  
}
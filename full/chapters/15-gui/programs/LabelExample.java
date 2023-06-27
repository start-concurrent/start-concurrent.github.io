import javax.swing.*;
import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        ImageIcon hibiscusIcon = new ImageIcon("pictures/hibiscus.jpg");
        JLabel flower = new JLabel("Red Hibiscus", hibiscusIcon, JLabel.CENTER);
        flower.setVerticalTextPosition(JLabel.BOTTOM); // <.>
        flower.setHorizontalTextPosition(JLabel.CENTER); // <.>
        frame.add(flower);
        frame.setSize(300,250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
  }  
}

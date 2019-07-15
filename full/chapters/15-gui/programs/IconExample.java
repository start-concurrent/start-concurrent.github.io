import javax.swing.*;
import java.awt.*;

public class IconExample {   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Icon Example");     
        ImageIcon smileIcon = new ImageIcon("pictures/smile.jpg"); // <.>
        JButton smileButton = new JButton(smileIcon); // <.>
        frame.add(smileButton);
        frame.setSize(325,250);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
  }  
}
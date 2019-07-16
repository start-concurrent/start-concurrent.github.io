import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Example");
		JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        final int MAX_BUTTONS = 6;    
        for(int i = 0; i < MAX_BUTTONS; i++)
            panel.add(new JButton("   " + i + "   "));
        frame.add(panel);
        frame.setSize(300,200);    
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setResizable(false);
        frame.setVisible(true);       
    }  
}
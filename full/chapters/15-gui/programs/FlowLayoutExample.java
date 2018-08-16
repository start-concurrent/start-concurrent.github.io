import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example"); // <1>
        JPanel panel = new JPanel(new FlowLayout()); // <2> 
        final int MAX_BUTTONS = 6;    
        for(int i = 0; i < MAX_BUTTONS; i++) // <3>
            panel.add(new JButton("   " + i + "   "));
        frame.add(panel);
        frame.setSize(250,100);    
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
        frame.setResizable(false);
        frame.setVisible(true);       
    }  
}
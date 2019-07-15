import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RainbowApplet extends JApplet{
    private JLabel label = new JLabel();
    
    public void init(){
        JButton button = new JButton("Rainbows");
        add(button, BorderLayout.NORTH);
        add(label, BorderLayout.SOUTH);
        button.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                label.setText("Have the colors ROYGBIV.");
            }
        });
    }
}


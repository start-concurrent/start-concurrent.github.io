import javax.swing.*;
import java.awt.*;

public class PasswordFieldExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Password Field Example");
		JPasswordField field = new JPasswordField(12);
		JPanel panel = new JPanel(new GridLayout(1,1));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel.add(field);
		frame.add(panel, BorderLayout.NORTH);	
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);     
    }  
}
import javax.swing.*;
import java.awt.*;

public class TextAreaExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Text Area Example");
		JTextArea textArea = new JTextArea("This is a text area.\n\nIt can contain multiple lines of text.");
		JPanel panel = new JPanel(new GridLayout(1,1));
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel.add(textArea);
		frame.add(panel, BorderLayout.NORTH);	
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);     
    }  
}
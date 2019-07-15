import javax.swing.*;
import java.awt.event.*;

public class FrameWithPanelAndActions {
    public static void main(String[] args){
        JFrame frame = new JFrame("Button Example"); 
        JPanel panel = new JPanel();
		
        JButton thisButton = new JButton("This"); 
        JButton thatButton = new JButton("That"); 
        JButton exitButton = new JButton("Exit"); 
        JTextField field = new JTextField("Text input and output area");
		
        panel.add(thisButton); 
        panel.add(thatButton);
        panel.add(field);
        panel.add(exitButton);
		
        // Add action listeners to various buttons
        thisButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){
                field.setText("You can get with this.");
            }
        });
        thatButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                field.setText("Or you can get with that.");
            }
        });
        exitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Exit");
                frame.dispose();
            }
        });
        frame.add(panel);
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);       
    }  
}
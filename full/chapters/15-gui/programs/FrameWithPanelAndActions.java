import javax.swing.*;
import java.awt.event.*;

public class FrameWithPanelAndActions {
    public static void main(String[] args){
        final JFrame soundCheck = new JFrame("Sound Check"); 
        JPanel soundPanel = new JPanel();
        JButton chirp = new JButton("Chirp"); 
        JButton bark = new JButton("Bark"); 
        JButton exit = new JButton("Exit"); 
        final JTextField message = new JTextField(
            "Listen to nature!");
        soundPanel.add(chirp); 
        soundPanel.add(bark);
        soundPanel.add(message);
        soundPanel.add(exit);
        // Add action listeners to various buttons
        chirp.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){
                message.setText("Chirp requested."); /*@\label{chirpRequestedLine}@*/   
            }
        });
        bark.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                message.setText("Bark requested.");
            }
        });
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("Exit");
                soundCheck.dispose();
            }
        });
        soundCheck.add(soundPanel);
        soundCheck.setSize(350,150);
        soundCheck.setDefaultCloseOperation(
            JFrame.DISPOSE_ON_CLOSE);
        soundCheck.setVisible(true);       
    }  
}
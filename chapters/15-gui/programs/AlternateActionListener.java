import javax.swing.*;
import java.awt.event.*;

public class AlternateActionListener implements ActionListener {
  JFrame soundCheck = new JFrame("Sound Check"); 
  JPanel soundPanel = new JPanel();
  JButton chirpButton = new JButton("Bird"); 
  JButton barkButton = new JButton("Dog"); 
  JButton exitButton = new JButton("Exit"); 
  JTextField message = new JTextField("Listen to nature!");
  
  public AlternateActionListener (){/*@\label{alternateActionListenerLine}@*/
    chirpButton.addActionListener(this); 
    barkButton.addActionListener(this);
    exitButton.addActionListener(this);
    soundPanel.add(chirpButton);
	soundPanel.add(barkButton);
    soundPanel.add(message);
	soundPanel.add(exitButton);    
    soundCheck.add(soundPanel);
    soundCheck.setSize(200,125);
    soundCheck.setDefaultCloseOperation(
    	JFrame.DISPOSE_ON_CLOSE);
    soundCheck.setVisible(true);       
  }     
  
  public void actionPerformed(ActionEvent e){/*@\label{actionPerformedLine}@*/
    Object button = e.getSource(); /*@\label{identifyObjectLine}@*/
    if(button == chirpButton) 
      message.setText("Chirp requested."); 
    else if(button == barkButton) 
      message.setText("Bark requested.");
    else {
      System.out.println("Exit");
      soundCheck.dispose();
    }
  }
  
  public static void main(String[] args){
    new AlternateActionListener(); 
  }   
}
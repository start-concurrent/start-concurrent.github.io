import java.io.*;  //<.>
import java.awt.event.*;
import javax.swing.*;
import javax.sound.sampled.*;

public class AnimalSounds { 
  public static void main (String[] args) throws Exception {
    JFrame frame = new JFrame("Animal Sounds");
    JPanel panel = new JPanel();
    JButton chirpButton = new JButton("Chirp");
    JButton barkButton = new JButton("Bark");
    JButton stopButton = new JButton("Stop Sound");
    JTextField field = new JTextField("Click Chirp or Bark.");
    File chirpFile = new File("sounds/chirp.wav"); //<.>
    File barkFile = new File("sounds/bark.wav");
    Clip chirpClip = AudioSystem.getClip(); //<.>
	chirpClip.open(AudioSystem.getAudioInputStream(chirpFile));
    Clip barkClip = AudioSystem.getClip();
	barkClip.open(AudioSystem.getAudioInputStream(barkFile));
    panel.add(chirpButton);
    panel.add(barkButton);
    panel.add(stopButton);
    panel.add(field);
    frame.add(panel);
    stopButton.setEnabled(false); // <.>
    chirpButton.addActionListener(new ActionListener() { // <.>
        public void actionPerformed(ActionEvent e){
            field.setText("Playing chirp.");
            barkButton.setEnabled(false);
            chirpClip.loop(Clip.LOOP_CONTINUOUSLY);
            stopButton.setEnabled(true);
      }
    });
    barkButton.addActionListener(new ActionListener(){ // <.>
        public void actionPerformed(ActionEvent e){
            field.setText("Playing bark.");
            chirpButton.setEnabled(false);
            barkClip.loop(Clip.LOOP_CONTINUOUSLY);
            stopButton.setEnabled(true);
      }
    });
    stopButton.addActionListener(new ActionListener(){ // <.>
        public void actionPerformed(ActionEvent e){
            field.setText("Click Chirp or Bark.");
            chirpClip.stop();            
            barkClip.stop();
			barkButton.setEnabled(true);
            chirpButton.setEnabled(true);
            stopButton.setEnabled(false);
      }
    });

    frame.setSize(275,200); // Set size in pixels
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true); // Display it      
  }
}
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;

public class SoundGame { 
  public static void main (String[] args) throws Exception {
    final JFrame soundGame = new JFrame("Sound Game");
    JPanel soundPanel = new JPanel();
    final JButton chirp = new JButton("Chirp");
    final JButton bark = new JButton("Bark");
    final JButton stop = new JButton("Stop Sound");
    final JButton exit = new JButton("Exit");
    final JTextField message = new JTextField("Click Chirp or Bark.   ");
    URL chirpURL = new URL("file:sounds/chirp.wav");
    URL barkURL = new URL("file:sounds/bark.wav");
    final AudioClip chirpClip = Applet.newAudioClip(chirpURL);
    final AudioClip barkClip = Applet.newAudioClip(barkURL);
    soundPanel.add(chirp);
    soundPanel.add(bark);
    soundPanel.add(stop);
    soundPanel.add(exit);
    soundPanel.add(message);
    soundGame.add(soundPanel);
    stop.setEnabled(false); // <1>
    chirp.addActionListener(new ActionListener() { // <2>
        public void actionPerformed(ActionEvent e){
            message.setText("Chirp sound playing.");
            bark.setEnabled(false);
            chirpClip.loop();
            stop.setEnabled(true);
      }
    });
    bark.addActionListener(new ActionListener(){ // <3>
        public void actionPerformed(ActionEvent e){
            message.setText("Bark sound playing.");
            chirp.setEnabled(false);
            barkClip.loop(); 
            stop.setEnabled(true);
      }
    });
    stop.addActionListener(new ActionListener(){ // <4>
        public void actionPerformed(ActionEvent e){
            message.setText("Click Chirp or Bark.");
            chirpClip.stop();
            bark.setEnabled(true);
            barkClip.stop();
            chirp.setEnabled(true);
            stop.setEnabled(false);
      }
    });
    exit.addActionListener(new ActionListener(){ // <5>
        public void actionPerformed(ActionEvent e){
            System.out.println("Exit");
            soundGame.dispose();
      }
    });
    soundGame.setSize(175,175); // Set size in pixels
    soundGame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    soundGame.setVisible(true); // Display it      
  }
}

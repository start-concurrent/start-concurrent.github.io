import javax.swing.*;

public class FrameWithPanel {
    public static void main(String[] args){
        // Create frame
        JFrame soundCheck = new JFrame("Sound Check"); // <1>
        JPanel soundPanel = new JPanel(); // <2>
        // Create three buttons
        JButton chirp = new JButton("Chirp"); // <3>
        JButton bark = new JButton("Bark");
        JButton exit = new JButton("Exit");
        JTextField message = new JTextField("Listen to nature!");
        soundPanel.add(chirp); // <4>
        soundPanel.add(bark); 
        soundPanel.add(message); 
        soundPanel.add(exit); 
        soundCheck.add(soundPanel); // <5>
        soundCheck.setSize(350,150); // Set size in pixels
        soundCheck.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        soundCheck.setVisible(true); // <6>
    }  
}
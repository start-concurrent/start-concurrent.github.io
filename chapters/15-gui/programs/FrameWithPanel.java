import javax.swing.*;

public class FrameWithPanel {
    public static void main(String[] args){
    	//Create frame
        JFrame soundCheck = new JFrame("Sound Check");
        JPanel soundPanel = new JPanel();
        //Create three buttons
        JButton chirp = new JButton("Chirp");
        JButton bark = new JButton("Bark");
        JButton exit = new JButton("Exit");
        JTextField message = new JTextField("Listen to nature!");
        soundPanel.add(chirp); // Add chirp to panel /*@\label{addBirdChirp}@*/
        soundPanel.add(bark); //Add bark to panel
        soundPanel.add(message); //Add message box
        soundPanel.add(exit); //Add exit button/*@\label{addExit}@*/
        soundCheck.add(soundPanel); //Add the panel to the frame/*@\label{addPanelToFrame}@*/
        soundCheck.setSize(350,150); //Set size in pixels
        soundCheck.setDefaultCloseOperation(
        	JFrame.DISPOSE_ON_CLOSE);
        soundCheck.setVisible(true); //Display frame       
    }  
}
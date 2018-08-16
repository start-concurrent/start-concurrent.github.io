import javax.swing.*;

public class EmptyFrame {
    public static void main(String[] args){
        //Create frame
        JFrame soundCheck = new JFrame("Sound Check");
        soundCheck.setSize(350,150); //Set size in pixels
        soundCheck.setDefaultCloseOperation(
                JFrame.DISPOSE_ON_CLOSE);
        soundCheck.setVisible(true); //Display it       
    }  
}
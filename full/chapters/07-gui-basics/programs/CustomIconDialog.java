import javax.swing.*;

public class CustomIconDialog{
    public static void main(String [] args){     
        String file = "bat.png";
        String title = "Custom Icon";
        String message = "Some bats eat 3,000 mosquitoes a night.";
        JOptionPane.showMessageDialog(null, message, title,
            JOptionPane.INFORMATION_MESSAGE, new ImageIcon(file)); // <1>
    }
}
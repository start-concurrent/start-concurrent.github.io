import javax.swing.*;

public class SampleDialogs {
    public static void main(String [] args){             
        int response;
        JOptionPane.showMessageDialog(null, "Error alert. Click OK to confirm", "Alert", JOptionPane.ERROR_MESSAGE);
        response = JOptionPane.showConfirmDialog(null, "Is 5 an odd number?", "Binary Selection", JOptionPane.YES_NO_OPTION);
        System.out.println(response);
    }   
}
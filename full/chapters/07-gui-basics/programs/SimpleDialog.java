import javax.swing.*; // <1>

public class SimpleDialog {    
    public static void main(String [] args) {     
        JOptionPane.showMessageDialog(null, // <2>
            "Task completed. Click OK to exit.",         
            "Simple Dialog", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Done."); // <3>
    }
}
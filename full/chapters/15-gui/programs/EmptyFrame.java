import javax.swing.*; //<.>

public class EmptyFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame("Empty Frame"); //<.>
        frame.setSize(350,200); //<.>
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //<.>
        frame.setVisible(true); //<.>
    }  
}

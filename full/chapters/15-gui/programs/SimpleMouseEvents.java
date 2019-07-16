import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMouseEvents implements MouseListener { // <.>
    private JFrame frame = new JFrame("Mouse Events");
    private JTextField status = new JTextField("Mouse status comes here.");
    private JButton oneButton = new JButton("One");
    private JButton twoButton = new JButton("Two");
    private int oneClicks = 0, twoClicks = 0; // Number of clicks
    
    public SimpleMouseEvents() { // <.>
        JPanel panel = new JPanel();        
        oneButton.addMouseListener(this);
        twoButton.addMouseListener(this);
        panel.add(oneButton);
        panel.add(twoButton);
        panel.add(status); 
        frame.add(panel);
        frame.setSize(275,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true); 
    }

    // Implement all abstract methods in MouseListener
    public void mouseEntered(MouseEvent e) { // <.>
        if (e.getSource() == oneButton) 
            status.setText("Mouse enters One.");
        else
            status.setText("Mouse enters Two.");      
    }
    
    public void mouseClicked(MouseEvent e) { // <.>
        if (e.getSource() == oneButton) {
            oneClicks++;
            status.setText("One clicked "+ oneClicks + " times.");
        }           
        else {
            twoClicks++;
            status.setText("Two clicked "+ twoClicks  + " times.");
        }
    }

    public void mouseExited(MouseEvent e) {} // Unused methods <.>
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {} 
    
    public static void main(String[] args){ // <.>
          new SimpleMouseEvents();
    }  
}
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ComboBoxExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("Combo Box Example"); 
		String[] data = {"RZA", "GZA", "ODB", "Method Man", "Raekwon", "Ghostface Killah", "Inspectah Deck", "U-God", "Masta Killa", "Cappadonna"};
        JComboBox<String> list = new JComboBox<String>(data);
		frame.add(list, BorderLayout.NORTH);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);       
    }  
}
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListExample {
    public static void main(String[] args){
        JFrame frame = new JFrame("List Example"); 
		String[] data = {"RZA", "GZA", "ODB", "Method Man", "Raekwon", "Ghostface Killah", "Inspectah Deck", "U-God", "Masta Killa", "Cappadonna"};
        JList<String> list = new JList<String>(data);
		frame.add(list, BorderLayout.NORTH);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);       
    }  
}
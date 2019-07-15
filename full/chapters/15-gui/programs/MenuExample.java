import javax.swing.*;
import java.awt.*;

public class MenuExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Menu Example"); 
		JMenuBar menuBar = new JMenuBar();
		JMenu frenchMenu = new JMenu("French Menu");
		JMenu germanMenu = new JMenu("German Menu");
		menuBar.add(frenchMenu);
		menuBar.add(germanMenu);
		JMenuItem coqAuVin = new JMenuItem("Coq au vin");
		JMenuItem moulesFrites = new JMenuItem("Moules-frites");
		frenchMenu.add(coqAuVin);
		frenchMenu.add(moulesFrites);
		frame.setJMenuBar(menuBar);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);    
		frame.setVisible(true);       
	}  
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimalIdentifier implements MouseListener {  
  JLabel bison, dove, gecko, spider;
  JFrame frame = new JFrame("Animal Identifier: Bison");

  public AnimalIdentifier() {/*@\label{PicIdentifierConstructorLine}@*/	
	JPanel panel = new JPanel(new GridLayout(2,2,5,5));
    ImageIcon bisonIcon = new ImageIcon("pictures/bison.jpg");
    ImageIcon doveIcon = new ImageIcon("pictures/dove.jpg");
    ImageIcon geckoIcon = new ImageIcon("pictures/gecko.jpg");
    ImageIcon spiderIcon = new ImageIcon("pictures/spider.jpg");
    bison = new JLabel(bisonIcon);
    bison.addMouseListener(this); /*@\label{buttonDecoratorLine}@*/
    dove = new JLabel(doveIcon);
    dove.addMouseListener(this);
    gecko = new JLabel(geckoIcon);
    gecko.addMouseListener(this);
    spider = new JLabel(spiderIcon);
    spider.addMouseListener(this);
    // Add labels
    panel.add(bison); /*@\label{prepareButtonPanelLine}@*/
    panel.add(dove); 
    panel.add(gecko);
    panel.add(spider);
    frame.add(panel);
    frame.setSize(400,400);
    frame.pack();
    frame.setDefaultCloseOperation(
    	JFrame.DISPOSE_ON_CLOSE);
    frame.setVisible(true); 
  }
  // Implement all abstract methods in MouseListener
  public void mouseEntered(MouseEvent e) { /*@\label{mouseEventEnteredLine}@*/
    Object label = e.getSource();/*@\label{getPicMouseEventLine}@*/
    if (label == bison)
      frame.setTitle("Animal Identifier: Bison");
    else if(label == dove)
      frame.setTitle("Animal Identifier: Dove");
    else if (label == gecko)
      frame.setTitle("Animal Identifier: Gecko");    
    else if (label == spider)
      frame.setTitle("Animal Identifier: Spider");
  }
    
  public void mouseExited(MouseEvent e) {
	  System.out.println("Mouse exited."); /*@\label{mouseEventsLine}@*/
  }
  
  public void mousePressed(MouseEvent e) {
	  System.out.println("Mouse pressed.");
  }
  
  public void mouseReleased(MouseEvent e) {
	  System.out.println("Mouse released");
  }    
  
  public void mouseClicked(MouseEvent e) {
	  System.out.println("Mouse clicked.");
  }
  
  public static void main(String[] args) {
    new AnimalIdentifier();
  }
}
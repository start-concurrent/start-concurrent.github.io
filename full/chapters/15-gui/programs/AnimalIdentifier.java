import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimalIdentifier extends MouseAdapter {  //<.>
    private JLabel bison, dove, gecko, spider; //<.>
    private JFrame frame = new JFrame("Animal Identifier");

    public AnimalIdentifier() { 
        JPanel panel = new JPanel(new GridLayout(2,2,5,5)); // <.>
        ImageIcon bisonIcon = new ImageIcon("pictures/bison.jpg");
        ImageIcon doveIcon = new ImageIcon("pictures/dove.jpg");
        ImageIcon geckoIcon = new ImageIcon("pictures/gecko.jpg");
        ImageIcon spiderIcon = new ImageIcon("pictures/spider.jpg");
        bison = new JLabel(bisonIcon); // <.>
        bison.addMouseListener(this); 
        dove = new JLabel(doveIcon);
        dove.addMouseListener(this);
        gecko = new JLabel(geckoIcon);
        gecko.addMouseListener(this);
        spider = new JLabel(spiderIcon);
        spider.addMouseListener(this);
        panel.add(bison); // <.>
        panel.add(dove); 
        panel.add(gecko);
        panel.add(spider);
        frame.add(panel);
        frame.setSize(400,400); // <.>
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true); 
    }
  
	public void mouseEntered(MouseEvent e) { // <.>
        Object label = e.getSource(); // <.>
        if(label == bison)
          frame.setTitle("Animal Identifier: Bison");
        else if(label == dove)
          frame.setTitle("Animal Identifier: Dove");
        else if (label == gecko)
          frame.setTitle("Animal Identifier: Gecko");    
        else if (label == spider)
          frame.setTitle("Animal Identifier: Spider");
    }

    public static void main(String[] args) { //<.>
        new AnimalIdentifier();
    }
}
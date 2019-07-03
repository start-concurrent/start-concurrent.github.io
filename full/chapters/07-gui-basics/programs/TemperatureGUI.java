import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TemperatureGUI extends JFrame implements ActionListener {
		JTextField celsiusField = new JTextField();
		JTextField fahrenheitField = new JTextField();
		JButton celsiusToFahrenheitButton = new JButton("Convert to Fahrenheit");
		JButton fahrenheitToCelsiusButton = new JButton("Convert to Celsius");		
    
    public TemperatureGUI() {		
		super("Temperature Converter");
		
		JPanel panel = new JPanel(new GridLayout(3,2,5,5));
		panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
	
		panel.add(new JLabel("Celsius"));
		panel.add(new JLabel("Fahrenheit"));		
        panel.add(celsiusField);
        panel.add(fahrenheitField);
        panel.add(celsiusToFahrenheitButton);
        panel.add(fahrenheitToCelsiusButton);
		add(panel, BorderLayout.CENTER);
		
        celsiusToFahrenheitButton.addActionListener(this);
        fahrenheitToCelsiusButton.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
		pack();
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == fahrenheitToCelsiusButton)
			convertToCelsius();
        else if(source == celsiusToFahrenheitButton)
			convertToFahrenheit();    
    }
    
    private void convertToFahrenheit() {        
        try {
            double value = Double.parseDouble(celsiusField.getText());
            fahrenheitField.setText("" + (32.0+9.0/5.0*value));            
        }
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Celsius value is incorrect.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void convertToCelsius() {        
        try {
            double value = Double.parseDouble(fahrenheitField.getText());
            celsiusField.setText("" + (5.0/9*(value-32)));
        }
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Fahrenheit value is incorrect.", "Format Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public static void main(String [] args){        
        new TemperatureGUI();
    }   
}
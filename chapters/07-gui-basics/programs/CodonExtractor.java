import javax.swing.*;

public class CodonExtractor {
	public static void main(String [] args) {       
		int continueProgram;
        do {
        	// Read DNA sequence
            String input = JOptionPane.showInputDialog(
            		"Enter a DNA sequence");/*@\label{DNAInputLine}@*/
            input = input.toUpperCase(); // Make upper case
			String message = "Do you want to continue?";
            if( isValid(input) ) // Check for validity 
                displayCodons(input); // Find codons
            else
				message = "Invalid DNA Sequence.\n" + message;
			continueProgram = JOptionPane.showConfirmDialog(
				null, message, "Alert", JOptionPane.YES_NO_OPTION);            
        } while(continueProgram == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,
        	"Thanks for using the Codon Extractor!");  
    }
		
    public static boolean isValid( String DNA ) {
        String validBases = "ACGT";                
        for( int i = 0; i < DNA.length(); i++) {
			char base = DNA.charAt(i);
            if( validBases.indexOf( base ) == -1 )			
				return false; //base not in "ACGT"
        }        
        return true;
    }

    public static void displayCodons(String DNA) {                
        String message = "";
		// Get as many complete codons as possible
        for (int i = 0; i < DNA.length() - 2; i += 3)
            message += "\n" + DNA.substring(i, i + 3);
		// 1-2 bases might be left over
        int remaining = DNA.length() % 3;        
        if( remaining == 1 )
            message += "\n"+ DNA.substring(DNA.length() - 1,
            	DNA.length()) + "**"; 
        else if( remaining == 2 )
            message += "\n"+ DNA.substring(DNA.length() - 2,
            	DNA.length()) + "*";
        message = "DNA length: " + DNA.length() +
        	"\n\nCodons: " + message;
        JOptionPane.showMessageDialog(null, message,
        	"Codons in DNA", JOptionPane.INFORMATION_MESSAGE);/*@\label{codonDisplayLine2}@*/   
    }
}
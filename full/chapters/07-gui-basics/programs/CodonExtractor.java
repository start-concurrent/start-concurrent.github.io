import javax.swing.*;

public class CodonExtractor {
    public static void main(String [] args) {       
        int continueProgram;
        do { // <1>
            // Read DNA sequence
            String input = JOptionPane.showInputDialog(
                    "Enter a DNA sequence"); // <2>
            input = input.toUpperCase(); // <3>
            String message = "Do you want to continue?";
            if( isValid(input) ) // <4>
                displayCodons(input); // <5>
            else
                message = "Invalid DNA Sequence.\n" + message;
            continueProgram = JOptionPane.showConfirmDialog( // <6>
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
        for (int i = 0; i < DNA.length() - 2; i += 3) // <1>
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
        JOptionPane.showMessageDialog(null, message, // <2>
            "Codons in DNA", JOptionPane.INFORMATION_MESSAGE);
    }
}
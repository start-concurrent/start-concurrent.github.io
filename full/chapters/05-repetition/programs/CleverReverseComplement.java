import java.util.*;

public class CleverReverseComplement {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a DNA sequence: ");
        String sequence = in.next().toUpperCase();              
        String reverseComplement = "";
        for(int i = 0; i < sequence.length(); i++)
            switch(sequence.charAt(i)) { //get complements
                case 'A': reverseComplement = "T" + reverseComplement; break;
                case 'C': reverseComplement = "G" + reverseComplement; break;
                case 'G': reverseComplement = "C" + reverseComplement; break;
                case 'T': reverseComplement = "A" + reverseComplement; break;
            }               
        System.out.println("Reverse complement: " + reverseComplement);
    }
}
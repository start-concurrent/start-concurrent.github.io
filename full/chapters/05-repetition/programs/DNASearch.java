import java.util.*;

public class DNASearch {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in); //<.>
        String sequence, subsequence;
        boolean valid; //<.>
        char c;
        
        do {
            System.out.print("Enter the DNA sequence you wish to search in: "); //<.>
            sequence = in.next().toUpperCase(); //<.>
            valid = true;
            for(int i = 0; i < sequence.length() && valid; i++) { //<.>
                c = sequence.charAt(i);
                if(c != 'A' && c != 'C' && c != 'G' && c != 'T') { //<.>
                    System.out.println("Invalid DNA sequence!");
                    valid = false;
                }
            }
        } while(!valid); //<.>
        
        do {        
            System.out.print("Enter the subsequence you wish to search for: ");
            subsequence  = in.next().toUpperCase();
            valid = true;
            for(int i = 0; i < subsequence.length() && valid; i++) {                
                c = subsequence.charAt(i);
                if(c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                    System.out.println("Invalid DNA sequence!");
                    valid = false;
                }
            }
        } while(!valid);
        
        int found = 0;
        for(int i = 0; i < sequence.length() - subsequence.length() + 1; i++) { //<.>
            for(int j = 0; j < subsequence.length(); j++) { //<.>
                if(subsequence.charAt(j) != sequence.charAt(i + j)) //<.>
                    break;
                if(j == subsequence.length() - 1) { //matches <.>
                    System.out.println("Match found at index " + i);
                    found++;
                }
            }
        }
        
        if(found == 1)
            System.out.println("One match found.");
        else
            System.out.println(found + " matches found.");
    }
}

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //<.>
        String[] words = new String[n]; //<.>
        int[] counts = new int[n]; //<.>
        String temp;    
        for(int i = 0; i < words.length; i++) //<.>
            words[i] = in.next().toLowerCase();
        while(in.hasNext()) { //<.>
            temp = in.next().toLowerCase();         
            for(int i = 0; i < n; i++) //<.>
                if(temp.equals(words[i])) {
                    counts[i]++; //<.>
                    break;  
                }           
        }
        System.out.println("The word counts are: ");
        for(int i = 0; i < words.length; i++) //<.>
            System.out.println(words[i] + " " + counts[i]);
    }
}
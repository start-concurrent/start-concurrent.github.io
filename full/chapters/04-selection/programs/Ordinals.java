import java.util.*;

public class Ordinals {
    public static void main(String[] args) {                
        Scanner in = new Scanner( System.in );      
        System.out.print("Please enter a positive number: ");
        int number = in.nextInt();
        String ending;
        switch( number % 10 ) {
            case 1:  ending = "st"; break;
            case 2:  ending = "nd"; break;
            case 3:  ending = "rd"; break;
            default: ending = "th"; break;
        }   
        System.out.println("Its ordinal version is "
            + number + ending + ".");
    }
}
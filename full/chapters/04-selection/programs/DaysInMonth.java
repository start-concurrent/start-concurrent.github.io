import java.util.*;

public class DaysInMonth {
    public static void main(String[] args) {                
        Scanner in = new Scanner( System.in );      
        System.out.print("Please a month number (1-12): ");
        int month = in.nextInt();
        int days = 0;
        switch( month ) {
            case 2:  days = 28; break; //<1>

            case 4:
            case 6:
            case 9:
            case 11: days = 30; break; //<2>

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31; break; //<3>
        }   
        System.out.println("The month you entered has " +
            days + " days.");
    }
}
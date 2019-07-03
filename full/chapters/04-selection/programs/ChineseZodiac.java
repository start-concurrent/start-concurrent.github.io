import java.util.*;

public class ChineseZodiac {
    public static void main(String[] args) {                
        Scanner in = new Scanner( System.in );      
        System.out.print("Please enter a year: ");
        int year = in.nextInt();        
        String animal = "";
        switch( year % 12 ) {
            case 0:  animal = "Monkey"; break;
            case 1:  animal = "Rooster"; break;
            case 2:  animal = "Dog"; break;
            case 3:  animal = "Boar"; break;
            case 4:  animal = "Rat"; break;
            case 5:  animal = "Ox"; break;
            case 6:  animal = "Tiger"; break;
            case 7:  animal = "Rabbit"; break;
            case 8:  animal = "Dragon"; break;
            case 9:  animal = "Snake"; break;
            case 10: animal = "Horse"; break;
            case 11: animal = "Ram"; break;
        }   
        System.out.println("The Chinese zodiac animal for this year is: " + animal);
    }
}

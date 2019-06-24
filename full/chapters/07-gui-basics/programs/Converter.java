import java.util.*;

public class Converter {
		   
    public static void main(String [] args){        
        Scanner in = new Scanner(System.in);
        System.out.print("\n\n\nEnter temperature (F): ");
        double degreesF = in.nextDouble();
        double degreesC = 5.0*(degreesF - 32)/9.0;
        System.out.println("Temperature (C): " + degreesC + "\n\n\n");
    }   
}
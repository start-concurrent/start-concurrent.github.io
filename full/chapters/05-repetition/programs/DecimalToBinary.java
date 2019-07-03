import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);      
        System.out.print("Please enter a base 10 number: ");
        int number = in.nextInt();
        int power = 1;
        while(power <= number/2)
            power *= 2;
        while(power > 0) {
            if(power > number)
                System.out.print(0);
            else {
                System.out.print(1);
                number -= power;
            }
            power /= 2;
        }
    }
}
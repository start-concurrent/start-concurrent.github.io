import java.util.Scanner;

public class TemperatureCLI {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("Enter temperature (F): ");
		double fahrenheit = in.nextDouble();
		double celsius = 5.0*(fahrenheit - 32.0)/9.0;
		System.out.println("Temperature (C): " + celsius);
		for(int i = 0; i < 10; ++i)
			System.out.println();		
	}	
}
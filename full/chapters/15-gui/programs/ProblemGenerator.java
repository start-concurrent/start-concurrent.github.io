import java.util.Random;
import javax.swing.*;

public class ProblemGenerator {
	public static Random random = new Random();
	
	public static int addPractice( JLabel label ) {
		int a = random.nextInt(12) + 1;
		int b = random.nextInt(12) + 1;
		label.setText( a + " + " + b + " = ");
		return a + b;		
	}
	
	public static int subtractPractice( JLabel label ) {
		int a = random.nextInt(12) + 1;
		int b = a + random.nextInt(12) + 1;
		label.setText( b + " - " + a + " = ");
		return b - a;		
	}
	
	public static int multiplyPractice( JLabel label ) {
		int a = random.nextInt(12) + 1;
		int b = random.nextInt(12) + 1;
		label.setText( a + " \u00D7 " + b + " = ");
		return a * b;		
	}
	
	public static int dividePractice( JLabel label ) {
		int a = random.nextInt(12) + 1;
		int b = a*(random.nextInt(12) + 1);
		label.setText( b + " \u00F7 " + a + " = ");
		return b / a;		
	}
}

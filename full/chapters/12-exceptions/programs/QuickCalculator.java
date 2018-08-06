import java.util.*;

public class QuickCalculator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);		
		int a, b, answer = 0;
		char operator;
		String[] terms;
		String line = in.nextLine().trim().toLowerCase();
		while( !line.equals("quit") ) {
			terms = line.split(" ");
			a = Integer.parseInt(terms[0]);
			operator = terms[1].charAt(0);
			b = Integer.parseInt(terms[2]);
			try{
				switch( operator ) {
					case '+': answer = a + b; break;
					case '-': answer = a - b; break;
					case '*': answer = a * b; break;
					case '/': answer = a / b; break;
				}
				System.out.println("Answer: " + answer);
			}
			catch( ArithmeticException e ) {
				System.out.println("You can't divide by 0!");
			}
			line = in.nextLine().trim().toLowerCase();
		}
	}
}
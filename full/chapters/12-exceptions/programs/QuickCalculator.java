import java.util.*;

public class QuickCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);        
        int answer = 0;
        String line = in.nextLine().trim().toLowerCase(); //<.>
        while(!line.equals("quit")) { //<.>
            String[] terms = line.split(" "); //<.>
            int a = Integer.parseInt(terms[0]);
            char operator = terms[1].charAt(0);
            int b = Integer.parseInt(terms[2]);
            try{ //<.>
                switch(operator) { //<.>
                    case '+': answer = a + b; break;
                    case '-': answer = a - b; break;
                    case '*': answer = a * b; break;
                    case '/': answer = a / b; break;
                }
                System.out.println("Answer: " + answer); //<.>
            }
            catch(ArithmeticException e) { //<.>
                System.out.println("You can't divide by 0!");
            }
            line = in.nextLine().trim().toLowerCase();
        }
    }
}